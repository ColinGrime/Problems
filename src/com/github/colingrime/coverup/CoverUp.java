package com.github.colingrime.coverup;

import java.util.Scanner;

public class CoverUp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[][] testCases = new int[n][2];
		for (int i=0; i<testCases.length; i++) {
			for (int j=0; j<testCases[i].length; j++) {
				testCases[i][j] = input.nextInt();
			}
		}

		System.out.println();

		for (int[] testCase : testCases) {
			double length = testCase[0] / 2.0;
			int radius = testCase[1];

			// Circle is fully in square.
			if (length >= radius) {
				System.out.printf("%.2f\n", Math.PI * Math.pow(radius, 2));
			}

			// Square is fully in circle.
			else if (radius >= length * Math.sqrt(2)) {
				System.out.printf("%.2f\n", Math.pow(length * 2, 2));
			}

			else {
				double area1 = 0.5 * length * Math.sqrt(Math.pow(radius, 2) - Math.pow(length, 2));

				double theta = (Math.PI / 2) - (2 * Math.acos(length / radius));
				double area2 = 0.5 * Math.pow(radius, 2) * theta;

				System.out.printf("%.2f\n", 4 * ((2 * area1) + area2));
			}
		}
	}
}
