
public class Account {
	// instance variables
	private int acno;
	private String customer;
	private double balance;

	// constructor
	public Account(int no, String name) {
		acno = no;
		customer = name;
	}

	// methods
	public void print() {
		System.out.println(acno);
		System.out.println(customer);
		System.out.println(balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Sorry! Insufficient Balance!");
	}

}
