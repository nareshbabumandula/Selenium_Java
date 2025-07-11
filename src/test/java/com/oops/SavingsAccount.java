package com.oops;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(amount <=balance) {
			balance-=amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}

}
