package Banking;

public class SavingsAccount {
	
	private double savingsBalance;
	private static double annualInterestRate;
	
	SavingsAccount(){
		double savingsBalance;
	}
	
	public void setBalance() {
		System.out.println("Enter the balance");
		savingsBalance = savingsAccountTest.scan.nextDouble();
	}
	
	public void setBalance(double savings) {
		savingsBalance = savings;
	}
	
	public double getBalance() {
		return savingsBalance;
	}
	
	public static void setAnnualInterestRate(double interest) {
		
		annualInterestRate = interest;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
}
