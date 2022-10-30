package com.github.colingrime.hiptranslator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HipTranslator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		Map<String, String> abbreviations = new HashMap<>();
		for (int i=0; i<n; i++) {
			String abbreviation = input.next();
			abbreviations.put(abbreviation, input.nextLine().substring(1));
		}

		String[] sentences = new String[input.nextInt()];
		input.nextLine();

		for (int i=0; i<sentences.length; i++) {
			sentences[i] = input.nextLine();
		}

		for (String sentence : sentences) {
			String[] words = sentence.split(" ");

			for (int j = 0; j < words.length; j++) {
				// Replace the word if it's an available abbreviation.
				System.out.print(abbreviations.getOrDefault(words[j], words[j]));

				// Check if space is needed.
				System.out.print(j >= words.length - 1 ? "\n" : " ");
			}
		}
	}
}
