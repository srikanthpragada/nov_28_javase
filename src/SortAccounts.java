
import java.util.Arrays;
import java.util.Comparator;

class CompareByBalance implements Comparator<Account> 
{
	@Override
	public int compare(Account a1, Account a2) {
		if (a1.getBalance() == a2.getBalance())
			return 0;
		else
			if ( a1.getBalance() > a2.getBalance())
				return 1;
			else
				return -1;
	}
	
}

public class SortAccounts {

	public static void main(String[] args) {
	  Account accounts []  = 
		  { new Account(1,"Abc",10000),
		    new Account(3,"Xyz",5000),
			new Account(2,"Def",2000) 
		  };
	  
	  Arrays.sort(accounts, new CompareByBalance());
	  
	  for(Account a : accounts)
		  System.out.println(a);
	}

}
