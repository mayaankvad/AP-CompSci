import java.util.ArrayList;
import java.util.List;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards. Cards are dealt from the top
	 * (highest index) down. The next card to be dealt is at size - 1.
	 */
	private int size;

	public Deck() {
		this(new String[] { "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen",
				"king", "ace" }, new String[] { "spades", "hearts", "clubs", "diamond" },
				new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11, 1 });
	}

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits, and produces
	 * one of the corresponding card.
	 *
	 * @param ranks
	 *            is an array containing all of the card ranks.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int j = 0; j < ranks.length; j++) {
			for (String suitString : suits) {
				cards.add(new Card(ranks[j], suitString, values[j]));
			}
		}
		size = cards.size();
		// shuffle();
	}

	/**
	 * Deals a card from this deck.
	 *
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (this.size <= 0) {
			return null;
		} else {
			return this.cards.get(--this.size);
		}
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 *
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.size <= 0;
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deck.
	 */
	public void shuffle() {
		// for (int k = cards.size() - 1; k > 0; k--) {
		// int howMany = k + 1;
		// int start = 0;
		// int randPos = (int) (Math.random() * howMany) + start;
		// Card temp = cards.get(k);
		// cards.set(k, cards.get(randPos));
		// cards.set(randPos, temp);
		// }
		// size = cards.size();

		int size = cards.size();
		ArrayList<Card> temp = new ArrayList<Card>();
		for (int i = 0; i <= size; i++) {
			int r = new java.util.Random().nextInt(size);

			for (;;) {
				r = new java.util.Random().nextInt(size);
				if (cards.get(r) != null) {
					break;
				}
			}

			temp.add(cards.get(r));
			cards.set(r, null);

		}
		cards = temp;

	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 *
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 *
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if (((size - k) % 2) == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if (((k - cards.size()) % 2) == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}

}
