package com.oops;

public interface Bank {
	
	double MIN_BALANCE = 1000.00;

	// By default all the methods in an interface are treated as public abstract
	void deposit(double amount);
	void withdraw(double amount);
	double checkbalance();
	
	default void printWelcomeMessage() {
		System.out.println("Welcome to your bank!");
	}
	
	static void printBankRules() {
		System.out.println("Rule: Minimum balance must be " +MIN_BALANCE);
	}
		
	
	public static void main(String[] args) {
		// Bank bank = new Bank();
		printBankRules();
		Bank.printBankRules();
	}
}
