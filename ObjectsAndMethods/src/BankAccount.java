
public class BankAccount {

	// Three parts to a variable accessor, type, identifier

	// Global variables

	public static void main(String[] args) {

		BankAccount acc = new BankAccount();
		System.out.println(acc);
		System.out.println(acc.toString());

		acc.deposit(200);

		BankAccount two = new BankAccount("88888", 1000);
		two.calcMonthlyInterest(3, two.getBalance());

		acc.withdraw(50);

	}

	private String acctNumb;

	private double balance;

	// Constructors to instantiate an object
	// method parameters are local. Cannot be accessed outside the method
	public BankAccount() {
		this.balance = 100;
		this.acctNumb = "99999";
	}

	// accessors get info about the class
	// return types indicate the type of data that is sent back

	// Overloaded Constructor
	public BankAccount(String acctNumb, double balance) {
		this.acctNumb = acctNumb;
		this.balance = balance;
	}

	// calcs intrest on acc then prints new balance
	public void calcMonthlyInterest(int rate, double b) {
		this.balance += (b * rate) / 100;
		System.out.println(getBalance());
	}

	// modifiers modify data in class
	public void deposit(double amount) {
		if (amount < 0) {
			System.err.println("Cannot deposite a negitive amount");
		} else {
			this.balance += amount;
			System.out.println(getBalance());
		}

	}

	public String getAccount() {
		return this.acctNumb;
	}

	public double getBalance() {
		return this.balance;
	}

	/*
	 * // public void calcMonthlyInterest(int rate) { balance += balance * rate
	 * / 100; System.out.println(getBalance()); } //
	 */

	// Overridden from Object
	@Override
	public String toString() {
		return ("This Bank Account has a balance of $" + getBalance() + " and Account Number: " + getAccount() + ".");
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			System.err.println("Cannot deposite a negitive amount");
		} else if ((getBalance() - amount) < 0) {
			System.err.println("Insufficent balance to withdraw $" + amount);
		} else {
			this.balance -= amount;
			System.out.println(getBalance());
		}

	}

}
