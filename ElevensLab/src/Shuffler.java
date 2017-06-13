import java.util.HashMap;
import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call to
	 * each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	public static Boolean arePermutations(int arr1[], int arr2[]) {
		if (arr1.length != arr2.length) {
			return false;
		}

		// Creates an empty hashMap hM
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		// Traverse through the first array and add elements to hash map
		for (int i = 0; i < arr1.length; i++) {
			int x = arr1[i];
			if (hM.get(x) == null) {
				hM.put(x, 1);
			} else {
				int k = hM.get(x);
				hM.put(x, k + 1);
			}
		}

		// Traverse through second array and check if every element is
		// present in hash map
		for (int i = 0; i < arr2.length; i++) {
			int x = arr2[i];

			// If element is not present in hash map or element
			// is not present less number of times
			if ((hM.get(x) == null) || (hM.get(x) == 0)) {
				return false;
			}

			int k = hM.get(x);
			hM.put(x, k - 1);
		}
		return true;

	}

	public static void flip() {
		int h = 0, t = 0;
		for (int i = 0; i < 100000; i++) {
			if (new Random().nextInt(3) <= 1) {
				h++;
			} else {
				t++;
			}
		}
		System.out.println("Heads: " + h + "\nTails " + t + "\n");
	}

	/**
	 * Tests shuffling methods.
	 *
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();

		flip();

		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 4, 3, 2, 1 };
		int[] array3 = { 1, 2, 3, 5 };
		System.out.println(arePermutations(array1, array2));
		System.out.println(arePermutations(array2, array3));

	}

	/**
	 * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
	 * splits the deck in half, then interleaves the cards in one half with the
	 * cards in the other.
	 *
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int[] temp = new int[values.length];
		int mid = (values.length + 1) / 2;

		int unshuffledPos = 0;
		for (int k = 0; k < mid; k++) {
			temp[unshuffledPos] = values[k];
			unshuffledPos += 2;
		}
		unshuffledPos = 1;
		for (int k = mid; k < values.length; k++) {
			temp[unshuffledPos] = values[k];
			unshuffledPos += 2;
		}
		for (int k = 0; k < values.length; k++) {
			values[k] = temp[k];
		}

	}

	/**
	 * Apply an "efficient selection shuffle" to the argument. The selection
	 * shuffle algorithm conceptually maintains two sequences of cards: the
	 * selected cards (initially empty) and the not-yet-selected cards
	 * (initially the entire deck). It repeatedly does the following until all
	 * cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards. An efficient version of this
	 * algorithm makes use of arrays to avoid searching for an as-yet-unselected
	 * card.
	 *
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		for (int k = values.length - 1; k > 0; k--) {
			int pos = (int) (Math.random() * (k + 1));
			int temp = values[pos];
			values[pos] = values[k];
			values[k] = temp;
		}
	}

}
