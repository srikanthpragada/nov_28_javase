
public class Account {
	// instance variables
	private int acno;
	private String customer;
	private double balance;
	// class variable
	private static double minbal = 1000;
	private static final String bank = "ICICI";

	// constructor
	public Account(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
	}

	public Account(int acno, String customer, double balance) {
		this(acno, customer);
		this.balance = balance;
	}

	// static methods
	public static double getMinbal() {
		return minbal;
	}
	
	public static void setMinbal(int minbal) {
		Account.minbal = minbal;
	}

	// methods
	public void print() {
		System.out.println(this.acno); // compile-time polymorphism
		System.out.println(this.customer);
		System.out.println(this.balance);
	}

	public void deposit(final double amount) {
		// amount = 100;
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - minbal >= amount)
			balance -= amount;
		else
			System.out.println("Sorry! Insufficient Balance!");
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomer() {
		return customer;
	}

}
