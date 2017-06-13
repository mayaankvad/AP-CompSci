package piggyBank;

import java.util.Scanner;

public class BankCombineTester {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Integer p, n, d, q;

		System.out.println("Collecting data for Bank 1:");
		System.out.print("Enter number of Pennies: ");
		p = scn.nextInt();
		System.out.print("Enter number of Nickels: ");
		n = scn.nextInt();
		System.out.print("Enter number of Dimes: ");
		d = scn.nextInt();
		System.out.print("Enter number of Quarters: ");
		q = scn.nextInt();
		PiggyBank one = new PiggyBank(p, n, d, q);
		System.out.println("\n" + one + "\n");

		System.out.println("Collecting data for Bank 2:");
		System.out.print("Enter number of Pennies: ");
		p = scn.nextInt();
		System.out.print("Enter number of Nickels: ");
		n = scn.nextInt();
		System.out.print("Enter number of Dimes: ");
		d = scn.nextInt();
		System.out.print("Enter number of Quarters: ");
		q = scn.nextInt();
		PiggyBank two = new PiggyBank(p, n, d, q);
		System.out.println("\n" + two + "\n");

		one.combinePiggy(two);
		System.out.println("\nCombined " + one + "\n");

		scn.close();
	}

	/*
	 * Alternate hardcoded main public static void main(String[] args) {
	 * PiggyBank one = new PiggyBank(1, 2, 3, 4); System.out.println("\n One:" +
	 * one + "\n");
	 *
	 * PiggyBank two = new PiggyBank(5, 6, 7, 8); System.out.println("\n Two:" +
	 * two + "\n");
	 *
	 * one.combinePiggy(two); System.out.println("\nCombined " + one + "\n");
	 *
	 * System.out.println("\n\nBank 1: " + one + "\n");
	 * System.out.println("\n\nBank 2: " + two + "\n");
	 *
	 * }
	 */

}
