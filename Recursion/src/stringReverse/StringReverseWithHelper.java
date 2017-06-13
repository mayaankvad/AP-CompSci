package stringReverse;

public class StringReverseWithHelper {

	public static void main(String[] args) {
		System.out.println(reverse("Hello!"));
		System.out.println("Expected: !olleH");
		System.out.println(reverse("Odd"));
		System.out.println("Expected: ddO");
	}

	public static String reverse(String str) {
		return reverseH(str, str.length() - 1);
	}

	private static String reverseH(String str, int pos) {
		if (pos == 0) {
			return str.substring(pos, pos + 1);
		} else {
			return str.substring(pos, pos + 1) + reverseH(str, pos - 1);
		}

	}

}
