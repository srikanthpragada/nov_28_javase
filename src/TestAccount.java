public class TestAccount {

	public static void main(String[] args) {

		Account a1; // object reference

		a1 = new Account(101, "Bill Gates");
		a1.print();
		a1.deposit(10000);
		try {
			a1.withdraw(15000);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}

}
