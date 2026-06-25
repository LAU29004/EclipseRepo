import bank.Accounts;
import bank.BalanceException;

public class TestAccounts {

	public static void main(String [] args) {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
//			e.printStackTrace(); // -> Developers Testing
			System.out.println(e); // -> Logging - Audit System Behaviour
			System.out.println(e.getMessage()); // -> End User
		}
		//System.out.println(ac);
		//ac.withdraw(7000);
		//System.out.println(ac);
		
		//ac.deposit(2000);
		//System.out.println(ac);
		//ac.deposit(5000);
		//System.out.println(ac);
	}

}
