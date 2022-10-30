package com.github.colingrime.binarizeit;

import java.util.Scanner;

public class BinarizeIt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[] nums = new int[n];
		for (int i=0; i<n; i++) {
			nums[i] = input.nextInt();
		}

		System.out.println();

		for (int num : nums) {
			System.out.println("Input value: " + num);
			// 2^x = num -> log2(num) = x
			System.out.println((int) Math.pow(2, Math.ceil(Math.log(num) / Math.log(2))));
			System.out.println();
		}
	}
}
