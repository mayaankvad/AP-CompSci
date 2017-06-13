package oddDigits;

public class OddDigits {

	public static int countOddDigits(int num) {

		if (num == 0) {
			return 0;
		}

		int p = num % 2;
		return p + countOddDigits(num / 10);
	}

	public static void main(String args[]) {
		System.out.println(countOddDigits(4532));
		System.out.println(countOddDigits(1114532));
		System.out.println(countOddDigits(2245327));
		System.out.println(countOddDigits(2468));
		System.out.println(countOddDigits(13579));

		// add more test cases
	}

}
