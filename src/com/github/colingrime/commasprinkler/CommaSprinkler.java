package com.github.colingrime.commasprinkler;

import java.util.Scanner;

public class CommaSprinkler {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String sentence = input.nextLine();
		String sentenceCopy;

		do {
			sentenceCopy = sentence;
			String[] words = sentence.split(" ");

			for (int i = 0; i < words.length; i++) {
				String word = words[i];

				// Check if the word has a comma at the end of it.
				if (word.charAt(word.length() - 1) == ',') {
					// Replace all succeeded words.
					sentence = replaceWithCommas(sentence, word, true);

					// Replace all preceded words.
					if (i != words.length - 1) {
						sentence = replaceWithCommas(sentence, words[i+1], false);
					}
				}
			}
		} while (!sentence.equalsIgnoreCase(sentenceCopy));

		System.out.println(sentence);
	}

	private static String replaceWithCommas(String sentence, String word, boolean isAfter) {
		word = word.replace(",", "").replace(".", "");
		String[] words = sentence.split(" ");

		for (int i=0; i<words.length; i++) {
			String w = words[i].replace(",", "").replace(".", "");

			// Place commas at the end of all words that need it.
			if (isAfter && word.equals(words[i])) {
				words[i] = words[i] + ",";
			}

			// Place commas before all words that need it.
			else if (!isAfter && word.equals(w) && i != 0 && !words[i-1].endsWith(",") && !words[i-1].endsWith(".")) {
				words[i-1] = words[i-1] + ",";
			}
		}

		return String.join(" ", words);
	}
}
