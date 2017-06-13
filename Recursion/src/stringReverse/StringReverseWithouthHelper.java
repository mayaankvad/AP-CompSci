package stringReverse;

public class StringReverseWithouthHelper {

	public static void main(String[] args) {
		System.out.println(reverse("Hello!"));
		System.out.println("Expected: !olleH");
		System.out.println(reverse("Odd"));
		System.out.println("Expected: ddO");
	}

	/**
	 * A method that reverses a string.
	 */
	public static String reverse(String text) {

		if (text.length() == 1) {
			return text;
		} else {
			return text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
		}

	}

}
