package examples;

import java.util.Random;

public class TwoDimMethods {

	public static void main(String[] args) {
		TwoDimMethods m = new TwoDimMethods();

		System.out.println(m.average());
		System.out.println(m.minimum());

	}

	private int[][] numbers;

	public TwoDimMethods() {
		this.numbers = new int[][] { { 11, 73, 5, 70 }, { 78, 276, 75, 34 }, { 21, 70, 94, 17 } };
	}

	public TwoDimMethods(int rows, int cols) {
		this.numbers = new int[rows][cols];
		this.loadRandom();
	}

	public double average() {
		double sum = 0;
		for (int[] r : numbers) {
			for (int c : r) {
				sum += c;
			}
		}
		return sum / (numbers.length * numbers[0].length);
	}

	public void display() {
		System.out.println("2Dim Array Printout");
		for (int row = 0; row < this.numbers.length; row++) {
			for (int col = 0; col < this.numbers[0].length; col++) {
				System.out.printf("%5d", this.numbers[row][col]);
			}
			System.out.println();
		}
	}

	public void display3() {
		System.out.println("2Dim Array Printout");
		for (int x[] : this.numbers) {
			for (int n : x) {
				System.out.printf("%5d", n);
			}
			System.out.println();
		}
	}

	public void displaySideways() {
		System.out.println("2Dim Array Printout Sydeways");
		for (int col = 0; col < this.numbers[0].length; col++) {
			for (int row = 0; row < this.numbers.length; row++) {
				System.out.printf("%5d", this.numbers[row][col]);
			}
			System.out.println();
		}
	}

	public void loadRandom() {
		for (int row = 0; row < this.numbers.length; row++) {
			for (int col = 0; col < this.numbers[0].length; col++) {
				this.numbers[row][col] = new Random().nextInt(100);
			}
		}
	}

	public int minimum() {
		int min = Integer.MAX_VALUE;
		for (int row = 0; row < this.numbers.length; row++) {
			for (int col = 0; col < this.numbers[0].length; col++) {
				if (numbers[row][col] < min) {
					min = numbers[row][col];
				}
			}
		}
		return min;
	}
}