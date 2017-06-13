package findAndIndexOf;

public class Find {

	public static boolean find(String text, String str) {
		if (text.length() == 0) {
			return false;
		}
		if (text.toLowerCase().startsWith(str.toLowerCase())) {
			return true;
		}
		return find(text.substring(1), str);
	}

	public static void main(String[] args) {
		// System.out.println(find("Mississippi", "sip"));
		// System.out.println(find("Google", "goog"));
		// System.out.println(find("1234567890", "x"));

	}

}
