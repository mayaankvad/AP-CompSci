package circle;

import java.util.Scanner;

public class CircleScanner {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Radius: ");
		System.out.println(new Circle(scn.nextDouble()));

		scn.close();

	}

}
