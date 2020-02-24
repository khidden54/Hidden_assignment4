package Banking;

public class savingsAccountTest {
	
	public static void test() {
		
		SavingsAccount saver1 = new SavingsAccount();
		
		saver1.setAnnualInterestRate();
		saver1.setBalance();
		
		SavingsAccount saver2 = new SavingsAccount();
		
		saver2.setBalance();
		saver2.setAnnualInterestRate();
		
	}
	
	public static void calculateMonthlyInterest(SavingsAccount saver) {
		
	}
}
