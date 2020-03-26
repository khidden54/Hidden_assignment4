package Banking;

import java.util.Scanner;

public class savingsAccountTest {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SavingsAccount.setAnnualInterestRate(0.04);
		
		System.out.println(SavingsAccount.getAnnualInterestRate());
		
		SavingsAccount saver1 = new SavingsAccount();
		saver1.setBalance();
		
		SavingsAccount saver2 = new SavingsAccount();
		saver2.setBalance();
		
		System.out.println("Monthly Savings for saver1:");
		calculateMonthlyInterest(saver1);
		
		System.out.println("Monthly savings for saver2: ");
		calculateMonthlyInterest(saver2);
		
		modifyInterestRate();
		
		System.out.println(SavingsAccount.getAnnualInterestRate());
		
		System.out.println("Monthly Savings for saver1:");
		calculateMonthlyInterest(saver1);
		
		System.out.println("Monthly savings for saver2: ");
		calculateMonthlyInterest(saver2);
		
	}
	
	public static void calculateMonthlyInterest(SavingsAccount saver) {
		
		double savings;
		
		for(int i = 0; i < 12; i++) {
			
			savings = saver.getBalance();
			saver.setBalance(savings + (savings * SavingsAccount.getAnnualInterestRate()) / 12);
			System.out.format("%.2f\n", (saver.getBalance()));
		}
	}
	
	public static void modifyInterestRate() {
		SavingsAccount.setAnnualInterestRate(0.05);
	}
}
