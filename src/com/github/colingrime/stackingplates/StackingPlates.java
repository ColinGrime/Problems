package com.github.colingrime.stackingplates;

import java.util.*;

public class StackingPlates {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Plates> plates = new ArrayList<>();

		// Apparently they want it only twice?
		for (int i=0; i<2; i++) {
			int n = input.nextInt();
			Plates testCase = new Plates();

			// Adds n number of stacks of plates.
			for (int j=0; j<n; j++) {
				int height = input.nextInt();
				int[] diameters = new int[height];

				// Get the diameters of a stack of plates.
				for (int k=0; k<height; k++) {
					diameters[k] = input.nextInt();
				}

				testCase.addStack(diameters);
			}

			plates.add(testCase);
		}

		System.out.println();

		for (int i=0; i<plates.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + calculateOperations(plates.get(i)));
			System.out.println();
		}
	}

	/**
	 * Calculates the minimum number of operations to combine the plates together.
	 * @param plates list of plates to calculate
	 * @return minimum number of operations
	 */
	private static int calculateOperations(Plates plates) {
		List<Stack<Integer>> stacks = plates.getStacks();
		System.out.println(stacks);

		// Gets a list of diameters from largest to smallest.
		List<Integer> diameters = new ArrayList<>();
		stacks.forEach(diameters::addAll);
		diameters.sort(Comparator.reverseOrder());

		int operations = 0;
		int lastDiamater = -1;

		for (int diameter : diameters) {
			// Gets the largest diameter.
			if (lastDiamater == -1) {
				lastDiamater = diameter;
				continue;
			}

			int size = stacks.size();
			for (int i=0; i<size; i++) {
				// If the stack contains the last diameter, they don't need to split (they would be joined later anyways).
				if (stacks.get(i).contains(lastDiamater)) {
					continue;
				}

				// Attempt to split a stack at the given diameter.
				if (plates.split(stacks.get(i), diameter)) {
					System.out.println(stacks);
					operations++;
				}
			}

			lastDiamater = diameter;
		}

		// Sort the list of stacks from largest to smallest.
		stacks.sort((s1, s2) -> s2.firstElement().compareTo(s1.firstElement()));

		// Join the list of stacks (the largest one is the base, the smallest one is the last to be joined).
		while (stacks.size() > 1) {
			plates.join(stacks.get(0), stacks.get(1));
			System.out.println(stacks);
			operations++;
		}

		return operations;
	}

	private static class Plates {

		private final List<Stack<Integer>> stacks = new ArrayList<>();

		/**
		 * Adds a stack of plates to the list of plates.
		 * @param diameters diameters of the plates
		 */
		public void addStack(int...diameters) {
			Stack<Integer> stack = new Stack<>();
			for (int i=diameters.length-1; i>=0; i--) {
				stack.push(diameters[i]);
			}
			stacks.add(stack);
		}

		public List<Stack<Integer>> getStacks() {
			return stacks;
		}

		/**
		 * Splits a stack at a certain diameter.
		 * @param stack stack to split
		 * @param splitDiameter diameter to split at (makes a new stack with all elements before and at this diameter)
		 * @return true if the stack was split, false if there was nothing to split
		 */
		public boolean split(Stack<Integer> stack, int splitDiameter) {
			// If the top element is greater than the split diameter, all elements are greater (nothing to split).
			// If the first element is less than or equal to the split diameter, the whole stack is included, so nothing splits.
			if (stack.peek() > splitDiameter || stack.firstElement() <= splitDiameter) {
				return false;
			}

			Stack<Integer> newStack = new Stack<>();

			// Creates a new stack with all elements before and at the split diameter.
			while (!stack.isEmpty()) {
				if (stack.peek() <= splitDiameter) {
					newStack.push(stack.pop());
				} else {
					break;
				}
			}

			// Reverses the stack (highest elements at the tail).
			newStack.sort(Comparator.reverseOrder());
			stacks.add(newStack);
			return true;
		}

		/**
		 * Joins two stacks together and deletes the empty one.
		 * @param stack1 main stack
		 * @param stack2 stack to put into the main stack
		 */
		public void join(Stack<Integer> stack1, Stack<Integer> stack2) {
			for (int i=stack2.size()-1; i>=0; i--) {
				stack1.push(stack2.get(i));
			}

			stacks.remove(stack2);
		}
	}
}
