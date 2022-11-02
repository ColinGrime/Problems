package com.github.colingrime.amalgamatedartichokes;

import java.util.Scanner;

public class AmalgamatedArtichokes {

	private static int p, a, b, c, d;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		p = input.nextInt();
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();

		int n = input.nextInt();
		double largestPrice = 0;
		double largestDecline = 0;

		for (int i=1; i<=n; i++) {
			double price = getPrice(i);

			if (price > largestPrice) {
				largestPrice = price;
				continue;
			}

			double decline = largestPrice - price;
			if (decline > largestDecline) {
				largestDecline = decline;
			}
		}

		System.out.println(largestDecline);
	}

	private static double getPrice(int k) {
		return p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
	}
}
