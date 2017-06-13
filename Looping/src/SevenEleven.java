import java.util.Random;

import javax.swing.JOptionPane;

public class SevenEleven {

	private static final String WINDOW_TITLE = "Seven Eleven";
	private static double initial;
	private static double bet;

	public static void exit() {
		int option = JOptionPane.showConfirmDialog(null, "You have $" + initial + "\nPlay Again?", WINDOW_TITLE,
				JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "You earned $" + initial + "\nGoodbye!", WINDOW_TITLE,
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

	public static double input(String message, double lowerBound, double upperBound) {
		while (true) {
			try {
				double input = Double.valueOf(
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

	private static void lose() {
		initial -= bet;
		bet = 0;
		JOptionPane.showMessageDialog(null, "You Lose \nYou have $" + initial, WINDOW_TITLE,
				JOptionPane.INFORMATION_MESSAGE);
		exit();
	}

	public static void main(String[] args) {
		start();
	}

	private static int rollDice() {
		JOptionPane.showMessageDialog(null, "Roll The Dice", WINDOW_TITLE, JOptionPane.INFORMATION_MESSAGE);
		int die1 = new Random().nextInt(6) + 1;
		int die2 = new Random().nextInt(6) + 1;
		JOptionPane.showMessageDialog(null, "The Dice are: " + die1 + " & " + die2, WINDOW_TITLE,
				JOptionPane.INFORMATION_MESSAGE);
		return die1 + die2;
	}

	public static void start() {
		JOptionPane.showMessageDialog(null, "Welcome", WINDOW_TITLE, JOptionPane.INFORMATION_MESSAGE);

		initial = input("Enter initial balance: ", 1, Integer.MAX_VALUE);

		while (initial > 0) {
			for (;;) {
				bet = input("You have $" + initial + "\nEnter your bet:", 0, initial);

				int roll = rollDice();
				if ((roll == 7) || (roll == 11)) {
					win();
					break;
				} else if ((roll == 2) || (roll == 3) || (roll == 12)) {
					lose();
					break;
				} else {
					for (;;) {
						double newRoll = rollDice();
						if (newRoll == roll) {
							win();
							break;
						} else if (newRoll == 7) {
							lose();
							break;
						}
					}
				}
			} // end for
		} // end while

		JOptionPane.showMessageDialog(null, "You have lost all your money. Goodbye!", WINDOW_TITLE,
				JOptionPane.INFORMATION_MESSAGE);

	} // end method

	private static void win() {
		initial += bet;
		bet = 0;
		JOptionPane.showMessageDialog(null, "You Win! \nYou have $" + initial, WINDOW_TITLE,
				JOptionPane.INFORMATION_MESSAGE);
		exit();
	}

}
