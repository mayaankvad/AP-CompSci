package worksheets;

import java.util.Arrays;

public class ArrayExampleWS3 {

	public static void $1() {
		int[] arr = new int[100];
		for (int i = 0, num = 1; i < arr.length; i++, num += 2) {
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static double $2(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return (double) sum / arr.length;
	}

	public static void $3() {
		String[] names = { "Adams", "Burke", "Chen", "Daly", "Eisenberg", "Foley", "Pathuri" };
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.print(names[i] + ", ");
		}
		System.out.println();
	}

	public static void $4(int[] arr) {

		int pos = 0, neg = 0;
		for (int i : arr) {
			if (i != 0) {
				if (i > 0) {
					pos++;
				} else {
					neg++;
				}
			}
		}

		int[] positive = new int[pos];
		int[] negitive = new int[neg];

		for (int i = 0, e = 0, o = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (arr[i] > 0) {
					positive[e] = arr[i];
					e++;
				} else {
					negitive[o] = arr[i];
					o++;
				}
			}
		}

		System.out.println("Pos: " + Arrays.toString(positive));
		System.out.println("Neg: " + Arrays.toString(negitive));

	}

	public static void main(String[] args) {

		$1();

		System.out.println();

		int[] x = { 100, 200, 300, 403 };
		System.out.println($2(x));

		System.out.println();

		$3();

		System.out.println();

		$4(new int[] { 100, -200, -300, -40323, 56, 76, -12, -14, 15, 12, -12 });

	}

}
