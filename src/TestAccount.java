public class TestAccount {

	public static void main(String[] args) {
		 
		Account a1;  // object reference 
		
		  a1 = new Account(101,"Bill Gates");
		  a1.print();
		  a1.deposit(10000);
		  a1.withdraw(15000);
		  a1.print();

		  Account a2 = new Account(102,"Steve", 10000);
		  a2.deposit(10000);
	  
		  System.out.println(a2.getBalance());
		  
		 // System.out.println( a1 > a2);
		  
		   
		  

	}

}
