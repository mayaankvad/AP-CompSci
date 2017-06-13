package bankArrayList;

public class BankAccount {

	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account: " + this.accountNumber + ", Balance: $" + this.balance;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

}
