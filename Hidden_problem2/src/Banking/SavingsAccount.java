package Banking;

public class SavingsAccount {
	
	private double savingsBalance;
	private double annualInterestRate;
	
	SavingsAccount(){
		double savingsBalance;
		double annualInterestRate;
		
	}
	
	public void setBalance() {
		savingsBalance = Bank.scan.nextDouble();
	}
	
	public double getBalance() {
		return savingsBalance;
	}
	
	public void setAnnualInterestRate() {
		annualInterestRate = Bank.scan.nextDouble();
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
}
