package triangle;

import java.util.Scanner;

public class UserInterface {

	public static Triangle createTriangle() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\nCollecting data for a new Triangle >> \n");

		System.out.println("Collecting data for Coordinate A: ");
		System.out.print("Enter X-value: ");
		double aX = scn.nextDouble();
		System.out.print("Enter Y-value: ");
		double aY = scn.nextDouble();

		System.out.println("\nCollecting data for Coordinate B: ");
		System.out.print("Enter X-value: ");
		double bX = scn.nextDouble();
		System.out.print("Enter Y-value: ");
		double bY = scn.nextDouble();

		System.out.println("\nCollecting data for Coordinate C: ");
		System.out.print("Enter X-value: ");
		double cX = scn.nextDouble();
		System.out.print("Enter Y-value: ");
		double cY = scn.nextDouble();

		System.out.println("\n<< Data Collection complete. New Triangle instantiated. \n");

		scn.close();

		return new Triangle(new Coordinate(aX, aY), new Coordinate(bX, bY), new Coordinate(cX, cY));

	}

	public static void main(String[] args) {

		System.out.println(new Triangle());

		System.out.println(createTriangle());

	}

}
