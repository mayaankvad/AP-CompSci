package wordClass;

import java.util.ArrayList;
import java.util.Random;

public class Word {

	private String original;

	/**
	 * constructs a Word with String value s
	 *
	 * @param s
	 *            is string value of Word
	 */
	public Word(String s) {
		this.original = s;
	}

	public String anagram() {
		Random rdn = new Random();
		ArrayList<Integer> usedIndexes = new ArrayList<Integer>();

		String anagram = "";

		for (int i = 0; i < this.original.length();) {
			Integer r = rdn.nextInt(this.original.length());
			if (!usedIndexes.contains(r)) {
				anagram += this.original.charAt(r);
				usedIndexes.add(r);
				i++;
			}
		}

		return anagram;

	}

	/**
	 * returns the length of the string
	 */
	public int getLength() {
		return this.original.length();
	}

	/**
	 * determines is word is a palindrome
	 *
	 * @return true if word is a palindrome, false otherwise
	 */
	public boolean isPalindrome() {
		return this.original.equalsIgnoreCase(this.reverse());
	}

	/**
	 * Alternate method to determine if word is a palindrome
	 *
	 * @return true if word is a palindrome, false otherwise
	 */
	public boolean isPalindrome2() {
		for (int i = 0; i < this.original.length(); i++) {
			if (this.original.toLowerCase().charAt(i) != this.reverse().toLowerCase().charAt(i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * removes vowels in original string
	 *
	 * @return a string that removes all of the vowels
	 */
	public String removeVowels() {
		String result = "";
		for (int i = 0; i < this.original.length(); i++) {
			if (!((this.original.toLowerCase().charAt(i) == 'a') || (this.original.toLowerCase().charAt(i) == 'e')
					|| (this.original.toLowerCase().charAt(i) == 'i') || (this.original.toLowerCase().charAt(i) == 'o')
					|| (this.original.toLowerCase().charAt(i) == 'u'))) {
				result += this.original.charAt(i);
			}
		}
		return result;
	}

	/**
	 * reverses letters in original string
	 *
	 * @return a string that is a reverse of original
	 */
	public String reverse() {
		String result = "";
		for (int i = this.original.length() - 1; i >= 0; i--) {
			result += this.original.charAt(i);
		}
		return result;
	}

}
