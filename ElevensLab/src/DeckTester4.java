/**
 * This is a class that tests the Deck class.
 */
public class DeckTester4 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {

		Deck deck = new Deck();

		System.out.println(deck);

		System.out.println("\n=== After Dealing: " + deck.deal() + " ===\n\n");
		System.out.println(deck);

		deck.shuffle();
		System.out.println(" -------- Shuffle 1:  \n" + deck + "\n\n\n");

		deck.shuffle();

		System.out.println(" >>>>>>> Shuffle 2:  \n" + deck + "\n\n\n");

		deck.shuffle();
		System.out.println("Shuffle 3:  \n" + deck + "\n\n\n");

	}
}
