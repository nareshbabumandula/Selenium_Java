package com.oops;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank = new SBI();
		//bank.MIN_BALANCE=1500; //The final field Bank.MIN_BALANCE cannot be assigned
		bank.deposit(3000);
		bank.withdraw(2000);
		System.out.println("Balance: " + bank.checkbalance());

	}

}
