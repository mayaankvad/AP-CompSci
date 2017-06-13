package almanac;

public class AlmanacTester {

	public static void main(String[] args) {
		Almanac tc = new Almanac();
		tc.printList();
		System.out.println("Average Population: " + tc.averagePop());
		System.out.println("Smallest: " + tc.smallestPop());
		tc.changePop("Newark", 15);
		System.out.println("After Change");
		tc.printList();
		tc.increasePop(3);
		System.out.println("After Increase");
		tc.printList();
	}

}
