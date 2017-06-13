
package mountainList;

public class MountainList {

	public static void main(String[] args) {
		System.out.println(sum(2, 5)); // the example shown above - result is 23
		System.out.println(sum(10, 15)); // result is 135
		System.out.println(sum(2, 35)); // result is 1223
		System.out.println(sum(1, 500)); // result is 250000

	}

	public static int sum(int lower, int upper) {
		return lower + sum(lower, upper, lower + 1, 1);
	}

	private static int sum(int lower, int upper, int pos, int i) {

		if (pos == lower) {
			return lower;
		}
		if (pos == upper) {
			i = -1;
		}
		return pos + sum(lower, upper, pos + i, i);
	}

}
