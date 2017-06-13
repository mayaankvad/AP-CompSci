import java.util.Random;

import javax.swing.JOptionPane;

// unfinished
public class Marbles {

	private static final String WINDOW_TITLE = "Marbles";

	private static int getRandom(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}

	private static int input(String message, double lowerBound, double upperBound) {
		while (true) {
			try {
				int input = Integer.valueOf(
						JOptionPane.showInputDialog(null, message, WINDOW_TITLE, JOptionPane.QUESTION_MESSAGE));
				if ((input > upperBound) || (input < lowerBound)) {
					JOptionPane.showMessageDialog(null, "ERROR: Input out of range", WINDOW_TITLE,
							JOptionPane.ERROR_MESSAGE);
				} else {
					return input;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERROR: Enter a number", WINDOW_TITLE, JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void main(String[] args) {

	}

	private static int makeMove(int mode, int pile) {
		return 0;
	}

	private int mode;

	private int pile;

	@SuppressWarnings("unused")
	public Marbles() {

		this.mode = getRandom(0, 1);
		this.pile = getRandom(1, 100);
		JOptionPane.showMessageDialog(null, "The pile size is " + this.pile, WINDOW_TITLE,
				JOptionPane.INFORMATION_MESSAGE);

		while (true) {
			this.pile -= input("Take between 1 and " + (this.pile / 2) + " marbles: ", 1, this.pile / 2);
			JOptionPane.showMessageDialog(null, "The pile size is now " + this.pile, WINDOW_TITLE,
					JOptionPane.INFORMATION_MESSAGE);

			int ai = makeMove(this.mode, this.pile);
			// JOptionPane.showMessageDialog(null, "The AI , WINDOW_TITLE,
			// JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
