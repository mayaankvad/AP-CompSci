package pigLatinTranslator;

import java.util.Scanner;

/**
 *
 * @author Mayaank Vadlamani
 * @version 11 / 28 / 2016
 *
 */
public class PigLatin {

	/**
	 * @param word
	 *            - the word to search
	 * @return index of first vowel or -1 if no vowels are found
	 */
	private static Integer firstVowel(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (isVowel(word.substring(i, i + 1))) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * @param word
	 *            with punctuation at the end
	 * @return the punctuation at the end of the word
	 */
	private static String getPunctuation(String word) {
		word = word.trim();
		String punctuation = "";
		while (true) {
			String lastChar = "" + word.charAt(word.length() - 1);
			if (isPunctuation(lastChar)) {
				punctuation += lastChar;
				word = word.substring(0, word.length() - 1);
			} else {
				break;
			}
		}
		return punctuation;
	}

	// == Word Translator Methods ==

	/**
	 * checks if a single letter is punctuation
	 *
	 * @param s
	 *            - a single letter
	 * @return true only if s is a single letter and a vowel
	 */
	private static Boolean isPunctuation(String s) {
		if (s.length() != 1) {
			return false;
		}
		String vowels = "!.,;?:";
		return vowels.indexOf(s) >= 0;
	}

	/**
	 * checks if a single letter is upper case
	 *
	 * @param s
	 *            - a single letter
	 * @return true only if s is a single upper case letter
	 */
	private static Boolean isUpperCase(String s) {
		if (s.length() != 1) {
			return false;
		}
		String targets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return targets.indexOf(s) >= 0;
	}

	/**
	 * checks if a single letter is upper case
	 *
	 * @param s
	 *            - a single letter
	 * @return true only if s is a single letter and a vowel
	 */
	private static Boolean isVowel(String s) {
		if (s.length() != 1) {
			return false;
		}
		String vowels = "aeiouAEIOU";
		return vowels.indexOf(s) >= 0;
	}

	// === Some helper Methods ===

	// --- Tester Method ---
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter bye to exit \n");
		while (true) {
			System.out.print("\nEnter Phrase: ");
			String in = scn.nextLine();
			if (in.equalsIgnoreCase("bye")) {
				break;
			}
			System.out.println(PigLatin.translate(in));
		}
		System.out.println("\n==Goodbye==");
		scn.close();
	}

	/**
	 * @param word
	 *            with punctuation at the end
	 * @return the word without the punctuation
	 */
	private static String stripPunctuation(String word) {
		return word.trim().substring(0, word.length() - getPunctuation(word).length());
	}

	/**
	 * Translates a full line at a time
	 *
	 * @param line
	 *            the line to be translated
	 * @return the translated line
	 */
	public static String translate(String line) {
		String res = "";
		line = line.trim();

		String[] words = line.split(" ");
		for (String word : words) {
			res += translateWord(word) + " ";
		}

		return res;
	}

	/**
	 * Handles translation of word with that contains no vowels by adding ay to
	 * the end of a word. Does not check if input is valid according to Pig
	 * Latin translation rules.
	 *
	 * @param word
	 *            that contains no vowels
	 * @return word with ay at the end
	 */
	private static String translateNoVowels(String word) {
		return word.trim() + "ay";
	}

	/**
	 * Handles translation of word with that contains no vowels by spliting the
	 * word at the first vowel and reversing it, adding ay at the end. (end +
	 * start + ay) Does not check if input is valid according to Pig Latin
	 * translation rules.
	 *
	 * @param word
	 *            that contains no vowels
	 * @return word with ay at the end
	 */
	private static String translateRegular(String word) {
		word = word.trim();
		Integer indexOfVowel = firstVowel(word);
		String start = word.substring(0, indexOfVowel);
		String end = word.substring(indexOfVowel);
		return end + start + "ay";
	}

	/**
	 * Handles translation of word with that contains no vowels by adding way to
	 * the end of a word. Does not check if input is valid according to Pig
	 * Latin translation rules.
	 *
	 * @param word
	 *            that contains no vowels
	 * @return word with way at the end
	 */
	private static String translateStartsWithVowel(String word) {
		return word.trim() + "way";
	}

	/**
	 * Translates a single word. It decides what translator method to use based
	 * on Pig Latin translation rules. It also handles capitalization and
	 * punctuation.
	 *
	 * @param word
	 *            to be translated
	 * @return the translated word with correct capitalization and punctuation
	 */
	private static String translateWord(String word) {
		String punctuation = getPunctuation(word); // Get punctuation
		word = stripPunctuation(word); // strip punctuation off the word

		String res = ""; // holds the result of translation
		// Case: No Vowels
		if (firstVowel(word) == -1) {
			res = translateNoVowels(word);
		} else if (firstVowel(word) == 0) {
			res = translateStartsWithVowel(word);
			// Case: Contains Vowel
		} else {
			res = translateRegular(word);
		}

		// return with proper capitalization and punctuation

		// match the case of the first char of the input String
		String firstChar = (isUpperCase(word.substring(0, 1))) ? res.substring(0, 1).toUpperCase()
				: res.substring(0, 1).toLowerCase();
		// return firstChar, the rest of the word and its punctuation
		return firstChar + res.substring(1).toLowerCase() + punctuation;
	}

}
