package example;

public class HelperExamples {

	public static int countOddDigits(int num) {

		return o(num, 0);
	}

	public static int findSum(int[] a) {
		return findSum(a, a.length - 1);
	}

	public static int findSum(int[] a, int index) {

		if (index == 0) {
			return a[0];
		}
		return (a[index] + findSum(a, index - 1));

	}

	public static void main(String[] args) {

		int x[] = { 1, 22, 33, 34, 56, 63, 79 };

		System.out.println(findSum(x));
		System.out.println(countOddDigits(1234));
	}

	public static int o(int num, int c) {
		if (num < 10) {
			if ((num % 2) == 1) {
				return c;
			}
		}
		if ((num % 2) == 0) {
			return o(num % 10, c + 1);
		} else {
			return o(num % 10, c);
		}
	}

}
