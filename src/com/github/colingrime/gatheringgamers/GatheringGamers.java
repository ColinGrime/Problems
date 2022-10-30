package com.github.colingrime.gatheringgamers;

import java.util.Scanner;

public class GatheringGamers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int peopleInLine = input.nextInt();
		int maxDistance = input.nextInt();

		input.nextLine();
		String chars = input.nextLine();
		System.out.println();

		boolean change = true;

		while (change) {
			for (int i=0; i<peopleInLine; i++) {
				// If the char is a gamer AND there's not a gamer ahead of them.
				if (chars.charAt(i) == 'G' && (i < peopleInLine - 1 && chars.charAt(i+1) == 'X')) {
					int closestGamer = getClosestGamer(chars, i, maxDistance);

					// Gamer doesn't move.
					if (closestGamer == -1) {
						change = false;
						continue;
					}

					// Establish the new line after gamer moves.
					chars = chars.substring(0, i) + chars.substring(i+1, closestGamer) + 'G' + chars.substring(closestGamer);

					// Indicate the String has changed during this iteration.
					change = true;
					break;
				}
			}
		}

		int largestGroup = 0;
		for (int i=0; i<peopleInLine; i++) {
			if (chars.charAt(i) == 'G') {
				// Get the group size.
				int furthestGamer = getFurthestGamer(chars, i);
				int groupSize = furthestGamer - i;

				// Check if the group is the new largest.
				if (groupSize > largestGroup) {
					largestGroup = groupSize;
				}

				i = furthestGamer;
			}
		}

		System.out.println(largestGroup);
	}

	private static int getClosestGamer(String chars, int pos, int maxDistance) {
		// Get the closest gamer if one is available.
		for (int i=pos+1; i<pos+1+maxDistance+1; i++) {
			if (i >= chars.length()) {
				return -1;
			} else if (chars.charAt(i) == 'G') {
				return i;
			}
		}

		return -1;
	}

	private static int getFurthestGamer(String chars, int pos) {
		// Get the furthest gamer in the group.
		for (int i=pos+1; i<chars.length(); i++) {
			if (chars.charAt(i) == 'X') {
				return i;
			}
		}

		return pos;
	}
}
