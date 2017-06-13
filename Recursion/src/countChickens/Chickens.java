package countChickens;

public class Chickens {

	public static int ch(String w, int count) {
		if (w.indexOf("chicken") < 0) {
			return count;
		} else {

			return ch(w.substring(0, w.indexOf("chicken")) + w.substring(w.indexOf("chicken") + 7), count + 1);

		}
	}

	public static int countChickens(String word) {
		return ch(word, 0);
	}

	public static void main(String[] args) {
		System.out.println(countChickens("itatfun"));
		System.out.println(countChickens("itatchickenfun"));
		System.out.println(countChickens("chchickchickenenicken"));
		System.out.println(countChickens("chickchickfun"));
		System.out.println(countChickens("chickenbouncetheballchicken"));
	}

}
