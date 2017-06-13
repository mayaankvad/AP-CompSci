package piggyBank;

import java.text.DecimalFormat;
import java.util.HashMap;

public class PiggyBank {

	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;

	public PiggyBank(int pennies, int nickels, int dimes, int quarters) {
		this.pennies = pennies;
		this.nickels = nickels;
		this.dimes = dimes;
		this.quarters = quarters;
	}

	public void combinePiggy(PiggyBank b) {
		// Add coins of other bank to this bank
		this.quarters += b.getCoins().get("quarters");
		this.dimes += b.getCoins().get("dimes");
		this.nickels += b.getCoins().get("nickels");
		this.pennies += b.getCoins().get("pennies");

		// Remove money from emptied bank
		b.pennies = 0;
		b.nickels = 0;
		b.dimes = 0;
		b.quarters = 0;

	}

	public HashMap<String, Integer> getCoins() {
		HashMap<String, Integer> coins = new HashMap<String, Integer>();

		coins.put("pennies", this.pennies);
		coins.put("nickels", this.nickels);
		coins.put("quarters", this.quarters);
		coins.put("dimes", this.dimes);

		return coins;
	}

	public Double getValue() {
		// Had issues with formatting to 2 decimal places so I took the easy way
		// out with decimal format
		return Double.valueOf(new DecimalFormat("##.##")
				.format((this.quarters * 0.25) + (this.dimes * 0.10) + (this.nickels * 0.05) + (this.pennies * 0.01)));
	}

	@Override
	public String toString() {
		return "Piggy Bank: \n" + "\t Pennies:      " + this.getCoins().get("pennies") + "\n" + "\t Nickels:      "
				+ this.getCoins().get("nickels") + "\n" + "\t Dimes:        " + this.getCoins().get("dimes") + "\n"
				+ "\t Quarters:     " + this.getCoins().get("quarters") + "\n" + "\t Total Value:  $" + this.getValue()
				+ "\n";
	}

}
