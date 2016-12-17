// Use anonymous inner class for implementation of Comparator 
import java.util.Arrays;
import java.util.Comparator;

public class SortAccounts2 {

	public static void main(String[] args) {
		Account accounts[] = { new Account(1, "Abc", 10000), new Account(3, "Xyz", 5000), new Account(2, "Def", 2000) };
		
		// Sort by balance
		Comparator<Account> compareObj = new Comparator<Account> () {
			@Override
			public int compare(Account a1, Account a2) {
				 return  (int) (a1.getBalance() - a2.getBalance());
			}
		};
		
		Arrays.sort(accounts, compareObj);

		for (Account a : accounts)
			System.out.println(a);
		
		// sort by acno
		
		Arrays.sort(accounts, new Comparator<Account>() {

			@Override
			public int compare(Account a1, Account a2) {
				return a1.getAcno() - a2.getAcno();
			}

		}

		);

		for (Account a : accounts)
			System.out.println(a);
	}

}
