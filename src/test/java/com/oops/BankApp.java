package com.oops;

public class BankApp {

	public static void main(String[] args) {
		// Upcasting
		BankAccount myAccount = new SavingsAccount("068001245513", 5000.0);
		myAccount.deposit(500);
		myAccount.withdraw(300);
		myAccount.showBalance();
		BankAccount.dematAccount();
	}

}
