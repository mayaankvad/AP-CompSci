package substringAndSubset;

import java.util.ArrayList;

public class SubstringGenerator {

	public static void main(String[] args) {
		System.out.println(new SubstringGenerator("rum").getSubstrings());
		System.out.println(new SubstringGenerator("abcde").getSubstrings());
	}

	private String text;

	private ArrayList<String> list = new ArrayList<String>();

	public SubstringGenerator(String text) {
		this.text = text;
		addAll(0);
	}

	private void addAll(int start) {
		if (start > text.length()) {
			return;
		}
		addStrings(start, start + 1);
		addAll(start + 1);
	}

	private void addStrings(int start, int pos) {
		if (pos > text.length()) {
			return;
		}
		list.add(text.substring(start, pos));
		addStrings(start, pos + 1);
	}

	public ArrayList<String> getSubstrings() {
		return list;
	}

	public String getText() {
		return text;
	}

}
