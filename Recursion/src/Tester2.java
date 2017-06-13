import squareRootApprox.SquareRoot;
import substringAndSubset.SubsetGenerator;
import substringAndSubset.SubstringGenerator;

public class Tester2 {

	public static void main(String[] args) {

		System.out.println("= Substrings =");
		System.out.println("at: " + new SubstringGenerator("at").getSubstrings());
		System.out.println("rat: " + new SubstringGenerator("rat").getSubstrings());
		System.out.println("brat: " + new SubstringGenerator("brat").getSubstrings());

		System.out.println("\n= Subsets =");
		System.out.println("rat: " + new SubsetGenerator("rat").getSubsets());
		// err here:
		System.out.println("at: " + new SubsetGenerator("at").getSubsets());
		//
		System.out.println("brat: " + new SubsetGenerator("brat").getSubsets());

		System.out.println("\n= Square Root =");
		System.out.println("18: " + SquareRoot.squareRoot(18));

	}

}
