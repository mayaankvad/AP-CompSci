package example;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(reverse("Hi09876"));
	}

	/**
	 * A method that reverses a string.
	 */
	public static String reverse(String text) {
		String rev = "";
		if (text.length() == 1) {
			return text;
		} else {
			rev += text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
			return rev;
		}

	}

}
