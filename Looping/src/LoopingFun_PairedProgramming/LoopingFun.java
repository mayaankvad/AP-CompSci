package LoopingFun_PairedProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LoopingFun {

	// 15
	public static int binary(int number) {
		String result = new String();
		for (int i = 31; i >= 0; i--) {
			int mask = 1 << i;
			result += ((number & mask) != 0 ? "1" : "0");
		}
		String fres = result.toString();
		return Integer.parseInt(fres);
	}

	// 10
	public static void coinTrials(int n) {
		int heads = new Random().nextInt(n);
		int tails = n - heads;
		System.out.println("Heads: " + heads + "\nTails: " + tails + "\n\n");
	}

	// 11
	public static int countDigits(int n) {
		String num = Integer.toString(n);
		return num.length();
	}

	// 3
	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	// 12
	public static void fibonacci(int n) {
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + ", " + n2);

		for (i = 2; i <= n; ++i) {
			n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	// 7
	public static int gcf(int a, int b) {
		int factor = 1;
		for (int i = 2; i <= Math.min(a, b); i++) {
			if (((a % i) == 0) && ((b % i) == 0)) {
				if (i > factor) {
					factor = i;
				}
			}
		}
		return factor;
	}

	// 4
	public static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	// 13
	public static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
				sum += i;
			}
		}
		return (sum == (2 * n));
	}

	// 5
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

	// 6
	public static int lcm(int a, int b) {
		for (int i = 1; i <= b; i++) {
			if (((a * i) % b) == 0) {
				return a * i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		System.out.println(sumDigits(1456));
		System.out.println(factorial(6));
		System.out.println(isPrime(17));
		System.out.println(isPrime(18));
		System.out.println(binary(9));
		primeFactorization(9);

	}

	// 14
	public static void primeFactorization(int n) {

		ArrayList<Integer> items = new ArrayList<Integer>();

		for (; n >= 2;) {
			for (int i = 1; i <= n; i++) {
				if (isPrime(i)) {
					if ((n % i) == 0) {
						items.add(new Integer(i));
						n /= i;
					}
				}
			}
		}

		Collections.sort(items);
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i));
			System.out.print((i != (items.size() - 1)) ? " * " : "  ");
		}
		System.out.println();

	}

	// 9b
	public static void primeNumberList(int n) {
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}

	// 1
	public static void printFactors(int n) {
		for (int i = 1; i <= (n / 2); i++) {
			if ((n % i) == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("and " + n + " are the factors of " + n + ".");
	}

	// 16
	public static void pyramid(int n) {
		int s = n - 1;
		for (int row = 0; row < n; row++) {

			for (int i = 0; i <= s; i++) {
				System.out.print(" ");
			}

			s--;

			for (int i = 0; i <= (2 * row); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 9a
	public static Integer reverseNum(int n) {
		String num = Integer.toString(n);
		String res = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			res += num.charAt(i);
		}
		return Integer.valueOf(res);
	}

	// 8
	public static int sumDigits(int n) {
		String num = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += Integer.valueOf(num.substring(i, i + 1));
		}
		return sum;
	}

	// 2
	public static int sumInts(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
