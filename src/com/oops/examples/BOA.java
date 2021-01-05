package com.oops.examples;

public class BOA implements FederalReserve{

	public static void main(String[] args) {
		
		BOA boa = new BOA();
		boa.minDeposit();
		boa.maxDeposit();
		boa.minWithDrawl();
		boa.maxWithDrawl();
		boa.AccountTypes();
		boa.RetirementPlans();
		boa.Loans();
		boa.mutualfunds(); // Default method
	
	
	}

	@Override
	public void minDeposit() {
		System.out.println("Min deposit is $100");
	}

	@Override
	public void maxDeposit() {
		System.out.println("Max deposit is $1000000");
	}

	@Override
	public void minWithDrawl() {
		System.out.println("Min withdrawl is $100");
	}

	@Override
	public void maxWithDrawl() {
		System.out.println("Max withdrawl is $1000000");
	}

	@Override
	public void Loans() {
		System.out.println("Personal, Commercial, Home loand are available");
	}

	@Override
	public void RetirementPlans() {
		System.out.println("401k plan is available");
	}

	@Override
	public void AccountTypes() {
		System.out.println("Personal, Joint AccountTypes are available");
		
	}

	@Override
	public void KYC() {
		System.out.println("KYC is taken care");
		
	}

	@Override
	public void stockPrice() {
		System.out.println("Executing stockPrice method..!");
		
	}

	

}
