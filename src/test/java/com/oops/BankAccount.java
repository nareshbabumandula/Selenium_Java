package com.oops;

public abstract class BankAccount {

	protected String accountNumber;
	protected double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// abstract method or bodyless method or method without body
	public abstract void withdraw(double amount);
	
	//concrete java method or method with body or non abstract method
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposited: " + amount);
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public static void dematAccount() {
		System.out.println("Demat account facility");
	}
	
}
