package worksheets;

import java.util.Arrays;

public class ArrayWorksheet4 {

	public static void animals(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i -= 2) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	public static int lowestSellingPrice(int[] arr) {
		int low = arr[0];
		for (int i : arr) {
			if (i < low) {
				low = i;
			}
		}
		return low;
	}

	public static void main(String[] args) {

		System.out.println("Minimum Price is " + lowestSellingPrice(new int[] { 10000000, 220000, 330500, 403000 }));

		System.out.println();
		squares();

		System.out.println("The array of names contains "
				+ names(new String[] { "Connolly", "Zapicchi", "Miller", "James", "Becker" }) + " letters.");

		System.out.println();

		animals(new String[] { "ape", "bear", "cat", "dog", "elephant", "gnu" });

		seperate(new String[] { "apple", "orange", "kiwi", "lemon", "pear", "mango" });

	}

	public static int names(String[] names) {
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		return sum;
	}

	public static String[][] seperate(String[] arr) {
		int AMsize = 0, NZsize = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].substring(0, 1).compareToIgnoreCase("m") <= 0) {
				AMsize++;
			} else {
				NZsize++;
			}
		}

		String[] AM = new String[AMsize], NZ = new String[NZsize];

		for (int i = 0, am = 0, nz = 0; i < arr.length; i++) {
			if (arr[i].substring(0, 1).compareToIgnoreCase("m") <= 0) {
				AM[am] = arr[i];
				am++;
			} else {
				NZ[nz] = arr[i];
				nz++;
			}
		}

		System.out.println("A-M: " + Arrays.toString(AM) + "\nN-Z: " + Arrays.toString(NZ));

		return new String[][] { AM, NZ };
	}

	public static void squares() {
		int[] squares = new int[100];
		for (int i = 0; i < 100; i++) {
			squares[i] = (int) Math.pow(i + 1, 2);
		}
		for (int i = squares.length - 1; i >= 0; i--) {
			System.out.print(squares[i] + ", ");
		}
		System.out.println();
	}

}
