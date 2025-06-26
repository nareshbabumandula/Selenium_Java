package com.oops;

public class SBI implements Bank{
	private double balance;

	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("SBI: Deposited " +amount);	
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount>=MIN_BALANCE) {
			balance-=amount;
			System.out.println("SBI: Withdrawn " +amount);	
		}else {
			System.out.println("SBI: Cannot withdraw, maintain minimum balance of " + MIN_BALANCE);
		}
	}

	@Override
	public double checkbalance() {
		return balance;
	}

	

}
