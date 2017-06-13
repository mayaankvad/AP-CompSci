package findAndIndexOf;

public class IndexOf {

	public static int indexOf(String text, String str) {
		return indexOf(text, str, 0);
	}

	private static int indexOf(String text, String str, int index) {
		if (text.length() == 0) {
			return -1;
		}
		if (text.toLowerCase().startsWith(str.toLowerCase())) {
			return index;
		}
		return indexOf(text.substring(1), str, index + 1);
	}

	public static void main(String[] args) {
		System.out.println(indexOf("Mississippi", "sip"));
		System.out.println(indexOf("abcdefghijklmnop", "cde"));
		System.out.println(indexOf("abcdefghijklmnop", "xyz"));
	}

}
