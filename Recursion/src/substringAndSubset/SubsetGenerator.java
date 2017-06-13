package substringAndSubset;

import java.util.ArrayList;

public class SubsetGenerator {

	public static void main(String[] args) {
		System.out.println(new SubsetGenerator("rum").getSubsets());
	}

	private String text;

	private ArrayList<String> list = new ArrayList<String>();

	public SubsetGenerator(String text) {
		this.text = text;
		list.add(text);
		addAll(0);
	}

	private void addAll(int start) {
		if (start >= text.length()) {
			return;
		}
		list.add(text.substring(start, start + 1));
		addStrings(start, start + 1);
		addAll(start + 1);
	}

	private void addStrings(int start, int add) {
		if (add >= text.length()) {
			return;
		}
		list.add(text.substring(start, start + 1) + text.substring(add, add + 1));
		addStrings(start, add + 1);
	}

	public ArrayList<String> getSubsets() {
		return list;
	}

	public String getText() {
		return text;
	}

}
