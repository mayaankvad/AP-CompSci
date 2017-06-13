package example;

public class Examples {

	public static int areaSquare(int s) {
		if (s == 1) {
			return 1;
		}
		return (s - 1) + (s - 1) + 1 + areaSquare(s - 1);
	}

	public static double e(int n) {
		if (n == 0) {
			return 1;
		}
		return (1.0 / factorial(n)) + e(n - 1);
	}

	public static long factorial(int y) {
		if (y == 1) {
			return 1;
		}
		return y * factorial(y - 1);
	}

	public static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(sumOfInts(3));
		System.out.println(fibonacci(7));
		System.out.println(e(3));
		System.out.println(areaSquare(5));
		System.out.println(sumDigits(10));
	}

	public static int sumDigits(int n) {
		if (n < 10) {
			return n;
		}
		return (n % 10) + sumDigits(n / 10);
	}

	public static long sumOfInts(int y) {
		return (y == 1) ? 1 : y + sumOfInts(y - 1);
	}

}
