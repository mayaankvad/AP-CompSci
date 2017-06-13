import java.util.Random;

public class LoopingFun {

	public static void asterisks(int row, int column) {

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void dieToHundred() {
		int count = 0;
		for (int sum = 0; sum < 100; count++) {
			sum += new Random().nextInt(6) + 1;
		}
		System.out.println(count);
	}

	public static int lcm(int a, int b) {
		for (int i = 1; i <= b; i++) {
			if (((a * i) % b) == 0) {
				return a * i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		asterisks(5, 20);

		dieToHundred();

		printFactors(12);
		printFactors2(12);

		System.out.println(lcm(6, 8));
	}

	public static void printFactors(int n) {
		System.out.print("The factors of " + n + " are: ");
		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.print("and " + n + ".");
		System.out.println();
	}

	public static void printFactors2(int n) {
		System.out.print("The factors of " + n + " are: ");
		int i = 1;
		while (i < n) {
			if ((n % i) == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
		System.out.print("and " + n + ".");
		System.out.println();
	}

}
