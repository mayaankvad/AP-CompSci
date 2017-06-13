package examples;

public class PascalTriangle {
	public static final int ROW = 30;
	private static int max = 0;

	public static void main(String[] args) {
		int[][] pascal = new int[ROW + 1][];
		pascal[1] = new int[1 + 2];
		pascal[1][1] = 1;
		for (int i = 2; i <= ROW; i++) {
			pascal[i] = new int[i + 2];
			for (int j = 1; j < (pascal[i].length - 1); j++) {
				pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
				String str = Integer.toString(pascal[i][j]);
				int len = str.length();
				if (len > max) {
					max = len;
				}
			}
		}

		for (int r = 1; r < pascal.length; r++) {
			for (int c = 1; c < (pascal[r].length - 1); c++) {
				System.out.print(pascal[r][c] + " ");
			}
			System.out.println();
		}

		// for (int i = 1; i <= ROW; i++) {
		// for (int k = ROW; k > i; k--)
		// System.out.format("%" + max + "s", " ");
		// for (int j = 1; j < pascal[i].length - 1; j++)
		// System.out.format("%" + (max *2) + "s", pascal[i][j]);
		// System.out.println();
		// }

	}
}