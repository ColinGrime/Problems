package com.github.colingrime.childcheck;

import java.util.Scanner;

public class ChildCheck {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[][] jerseys = new int[n][10];
		for (int i=0; i<jerseys.length; i++) {
			for (int j=0; j<jerseys[i].length; j++) {
				jerseys[i][j] = input.nextInt();
			}
		}

		System.out.println();

		for (int[] set : jerseys) {
			boolean containsMack = false;
			boolean containsZack = false;

			for (int i=0; i<set.length; i++) {
				int number = set[i];
				if (number == 18) {
					containsMack = true;
				} else if (number == 17) {
					containsZack = true;
				}

				// Print set.
				System.out.print(number);
				System.out.print(i >= set.length - 1 ? "\n" : " ");
			}

			// Count how many twins are in the set.
			if (containsMack && containsZack) {
				System.out.println("both");
			} else if (containsMack) {
				System.out.println("mack");
			} else if (containsZack) {
				System.out.println("zack");
			} else {
				System.out.println("none");
			}

			System.out.println();
		}
	}
}
