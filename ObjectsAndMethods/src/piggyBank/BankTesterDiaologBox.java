package piggyBank;

import javax.swing.JOptionPane;

public class BankTesterDiaologBox {

	public static void main(String[] args) {

		if (JOptionPane.showConfirmDialog(null, "Make A New Piggy Bank", null,
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			int pennies = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter number of Pennies: "));
			int nickels = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter number of Nickels: "));
			int dimes = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter number of Dimes: "));
			int quarters = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter number of Quarters: "));

			PiggyBank bank = new PiggyBank(pennies, nickels, dimes, quarters);

			JOptionPane.showMessageDialog(null, bank);
		}

	}

}
