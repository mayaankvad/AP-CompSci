package StringFunctions;

/**
 * @version 1.0
 * @author Mayaank Vadlamani
 * @author Darren Liao
 *
 *         Copyright (C) 2016 Mayaank Vadlamani & Darren Liao All Rights
 *         Reserved.
 *
 */
public class StringFuncts {

	// 10. This will return true if the sum of the first digit and the last
	// digit is divisible by 5.
	// checkDigit("123456789") ====> TRUE
	// checkDigit("12345543211") ====> FALSE
	// checkDigit("87878787") ====> TRUE
	public static Boolean checkDigit(String creditCard) {
		int first = Integer.parseInt(creditCard.substring(0, 1));
		int last = Integer.parseInt(creditCard.substring(creditCard.length() - 1, creditCard.length()));
		return ((first + last) % 5) == 0;
	}

	// 8. This will return a new word of every other letter
	// everyOtherLetter("PIRATES") ====> PRTS
	public static String everyOtherLetter(String word) {
		String res = "";
		for (int i = 0; i < word.length(); i++) {
			res += ((i % 2) == 0) ? word.charAt(i) : "";
		}
		return res;
	}

	// 11. This will return a string where every other letter is capitalized
	// everyOtherLetterCaps("misterscarpitta") ====> mIsTeRsCaRpItIa
	public static String everyOtherLetterCaps(String word) {
		String res = "";
		for (int i = 0; i < word.length(); i++) {
			res += ((i % 2) == 0) ? word.substring(i, i + 1).toLowerCase() : word.substring(i, i + 1).toUpperCase();
		}
		return res;
	}

	// 1.This method will return an email address in the form
	// first.last@ww-p.org
	// getEmail("Mister", "Scarpitta") ====> Mister.Scarpitta@ww-p.org
	public static String getEmail(String first, String last) {
		return first + "." + last + "@ww-p.org";
	}

	// 5. This method will parse the first name from a full name separated with
	// a space
	// getFirst("Mister Scarpitta") ====> Mister
	public static String getFirst(String fullName) {
		return fullName.substring(0, fullName.indexOf(" "));
	}

	// 2. This method will return initials with periods.
	// getInitials("Mister", "Scarpitta") ====> M.S.
	public static String getInitials(String first, String last) {
		return first.toUpperCase().charAt(0) + "." + "" + last.toUpperCase().charAt(0) + ".";
	}

	// 6. This method will parse the last name from a full name separated with a
	// space
	// getLast("Mister Scarpitta") ====> Scarpitta
	public static String getLast(String fullName) {
		return fullName.substring(fullName.indexOf(" "), fullName.length());
	}

	// 7. This will return a random 4 letter string of letters
	// getRandomWord() ====> CDRT
	public static String getRandomWord() {
		String choice = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int min = 0, max = choice.length() - 1;
		String res = "";
		for (int i = 0; i < 4; i++) {
			int num = min + (int) (Math.random() * ((max - min) + 1));
			res += choice.charAt(num);
		}
		return res;
	}

	// 4. This method will return a lower case
	// user name in the form of first 3 letters of first name and
	// last 4 letters of last name.
	// getUserName("Mister", "Scarpitta") ====> misitta
	public static String getUserName(String first, String last) {
		return first.toLowerCase().substring(0, 3) + last.toLowerCase().substring(last.length() - 4, last.length());
	}

	// 3. This method will parse the year from a birthdate
	// in the form MMDDYYYY
	// getYear("01021916) ====> 1916
	public static String getYear(String bday) {
		return bday.substring(bday.length() - 4, bday.length());
	}

	public static void main(String[] args) {
		System.out.println("1. Email: " + getEmail("Mister", "Scarpitta"));
		System.out.println("2. Initials: " + getInitials("Mister", "Scarpitta"));
		System.out.println("3. Year: " + getYear("01021916"));
		System.out.println("4. UserName: " + getUserName("Mister", "Scarpitta"));
		System.out.println("5. FirstName: " + getFirst("Mister Scarpitta"));
		System.out.println("6. LastName: " + getLast("Mister Scarpitta"));
		System.out.println("7. RandomWord: " + getRandomWord());
		System.out.println("8. EveryOtherLetter: " + everyOtherLetter("encyclopedias"));
		System.out.println("9A. Reverse: " + reverse("Philadelphia"));
		System.out.println("9B. Reverse: " + reverse("JAVA"));
		System.out.println("10A. CheckDigit: " + checkDigit("123456"));
		System.out.println("10B. CheckDigit: " + checkDigit("123456789"));
		System.out.println("11. EveryOtherCaps: " + everyOtherLetterCaps("misterscarpitta"));
		System.out.println("12. Replaces I's with 8's: " + replaceIsWith8s("WilliamScarpitta"));
	}

	// 12. This will return a string where every i is replaced with an 8
	// replacesIsWith8s("WilliamScarpitta") ====> W8ll8amScarp8tta
	public static String replaceIsWith8s(String word) {
		String n = "";
		for (int i = 0; i < word.length(); i++) {
			n += (word.substring(i, i + 1).equalsIgnoreCase("i")) ? "8" : word.substring(i, i + 1);
		}
		return n;
	}

	// 9. This will return a new word that is the reverse.
	// reverse("PIRATES ") ====> SETARIP
	public static String reverse(String word) {
		String res = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			res += word.charAt(i);
		}
		return res;
	}

}
