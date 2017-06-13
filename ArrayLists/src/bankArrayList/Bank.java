package bankArrayList;

import java.util.ArrayList;

public class Bank {

	private ArrayList<BankAccount> accounts;

	public Bank() {
		this.accounts = new ArrayList<BankAccount>();
	}

	/* im making sure the acct # is unique */
	public void addAccount(BankAccount a) {
		// for(BankAccount b: this.accounts)
		// if(b.getAccountNumber() == a.getAccountNumber())
		// return ;
		this.accounts.add(a);
	}

	public int count(double atLeast) {
		int count = 0;
		for (BankAccount b : this.accounts) {
			if (b.getBalance() >= atLeast) {
				count++;
			}
		}
		return count;
	}

	public BankAccount find(int accountNumber) {
		for (BankAccount b : this.accounts) {
			if (b.getAccountNumber() == accountNumber) {
				return b;
			}
		}
		return null;
	}

	public BankAccount getMaximum() {
		int highest = 0;
		for (int i = 0; i < this.accounts.size(); i++) {
			if (this.accounts.get(highest).getBalance() < this.accounts.get(i).getBalance()) {
				highest = i;
			}
		}
		return this.accounts.get(highest);
	}

	public double getTotalBalance() {
		double sum = 0;
		for (BankAccount b : this.accounts) {
			sum += b.getBalance();
		}
		return sum;
	}

}
