package com.oops.examples;

public interface FederalReserve extends Banking, NSE{

	abstract void minDeposit();
	abstract void maxDeposit();
	abstract void minWithDrawl();
	abstract void maxWithDrawl();
	abstract void Loans();
	abstract void RetirementPlans();
	abstract void AccountTypes();
		
	default void mutualfunds() {
		System.out.println("This is a default method");
	}
	
	static void educationalloan() {
		System.out.println("Educational loan facility is available");
	}
	
	
	public static void main(String[] args) {
		//FederalReserve fr = new FederalReserve();
		//FederalReserve fr = null;
		//fr.mutualfunds();
		educationalloan(); // Static method
	}

}
