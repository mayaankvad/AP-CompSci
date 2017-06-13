package examples;

import java.util.ArrayList;

public class MagicSquare {

	public static void main(String[] args) {
		int[][] one = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };
		int[][] two = { { 14, 5, 2, 4 }, { 3, 12, 6, 8 }, { 9, 11, 7, 10 }, { 13, 15, 16, 1 } };
		int[][] three = { { 14, 5, 2 }, { 3, 12, 6 }, { 9, 11, 7 } };
		int[][] four = { { 32, 29, 4, 1, 24, 21 }, { 30, 31, 2, 3, 22, 23 }, { 12, 9, 17, 20, 28, 25 },
				{ 10, 11, 18, 19, 26, 27 }, { 13, 16, 36, 33, 5, 8 }, { 14, 15, 34, 35, 6, 7 } };
		int[][] five = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 }, { 2, 3, 4, 1 } };
		int[][] six = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		MagicSquare tms = new MagicSquare();
		tms.printTable(one);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(one));
		System.out.println();
		tms.printTable(two);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(two));
		System.out.println();
		tms.printTable(three);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(three));
		System.out.println();
		tms.printTable(four);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(four));
		System.out.println();
		tms.printTable(five);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(five));
		System.out.println();
		tms.printTable(six);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(six));

	}

	void printTable(int[][] square) {
		for (int[] x : square) {
			for (int i : x) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	int sumCol(int[][] square, int col) {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][col];
		}
		return sum;
	}

	int sumDiagonalLeft(int[][] square) {
		int sum = 0;
		for (int i = square.length - 1; i >= 0; i--) {
			sum += square[i][i];
		}
		return sum;
	}

	int sumDiagonalRight(int[][] square) {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][i];
		}
		return sum;
	}

	int sumRow(int[][] square, int row) {
		int sum = 0;
		for (int i : square[row]) {
			sum += i;
		}
		return sum;
	}

	boolean testMagic(int[][] square) {
		int sumRow = sumRow(square, 0);
		for (int i = 1; i < square.length; i++) {
			if (sumRow(square, i) != sumRow) {
				return false;
			}
		}

		int sumCol = sumCol(square, 0);
		for (int i = 1; i < square.length; i++) {
			if (sumCol(square, i) != sumCol) {
				return false;
			}
		}

		return (sumRow == sumCol) && (sumDiagonalRight(square) == sumDiagonalLeft(square)) && unique(square);

	}

	boolean unique(int[][] square) {
		ArrayList<Integer> seen = new ArrayList<Integer>();
		for (int r = 0; r < square.length; r++) {
			for (int c = 0; c < square.length; c++) {
				if (seen.contains(square[r][c])) {
					return false;
				}
				seen.add(square[r][c]);
			}
		}
		return true;
	}

}
