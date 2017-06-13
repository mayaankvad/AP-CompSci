import java.util.Scanner;

public class TestAverages {

	public static double average(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("How many tests: ");
		int[] avg = new int[scn.nextInt()];

		for (int i = 0; i < avg.length; i++) {
			System.out.print("Enter test " + (i + 1) + ": ");
			avg[i] = scn.nextInt();
		}

		System.out.print("The average of ");
		for (int i = 0; i < avg.length; i++) {
			System.out.print(avg[i] + ", ");
		}
		System.out.println("is " + average(avg));

		scn.close();

	}

}
