import findAndIndexOf.Find;
import findAndIndexOf.IndexOf;
import luckySevens.Lucky;

public class Tester {

	public static void main(String[] args) {

		System.out.println("LUCKY SEVENS");
		System.out.println("1087171 scores a: \t\t" + Lucky.luckySevens(1087171));
		System.out.println("1077171 scores a: \t\t" + Lucky.luckySevens(1077171));
		System.out.println("77077 scores a: \t\t" + Lucky.luckySevens(77077));
		System.out.println("97171771707797L scores a: \t" + Lucky.luckySevens(97171771707797L));
		System.out.println("1089651234 scores a: \t\t" + Lucky.luckySevens(1089651234));
		System.out.println();

		System.out.println("\nFIND");
		System.out.print("Mississippi" + " & " + "sip: " + Find.find("Mississippi", "sip"));
		System.out.println("...Expected: true");
		System.out.print("Mississippi" + " & " + "sisip: " + Find.find("Mississippi", "sisip"));
		System.out.println("...Expected: false");
		System.out.print("shoe" + " & " + "oe: " + Find.find("shoe", "oe"));
		System.out.println("...Expected: true");

		System.out.println("\nINDEX OF");
		System.out.print("Mississippi" + " & " + "sip" + " has index: " + IndexOf.indexOf("Mississippi", "sip"));
		System.out.println(" - Expected: 6");
		System.out.print("Mississippi" + " & " + "Miss" + " has index: " + IndexOf.indexOf("Mississippi", "Miss"));
		System.out.println(" - Expected: 0");
		System.out.print("shoe" + " & " + "oe: " + " has index: " + IndexOf.indexOf("shoe", "oe"));
		System.out.println(" - Expected: 2");
		System.out.print("shoe" + " & " + "foot" + " has index: " + IndexOf.indexOf("shoe", "foot"));
		System.out.println(" - Expected: -1");

	}

}
