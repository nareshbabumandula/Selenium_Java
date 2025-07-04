package com.exceptions;

public class Voter {
	
	public void checkEligibility(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age " + age + " is not eligible for voting.");
		}
		System.out.println("Age " + age + " is eligible for voting.");
	}

}
