package com.exceptions;

public class VotingImpl {

	public static void main(String[] args) {
		Voter voter = new Voter();
		
		try {
			voter.checkEligibility(17); // This will throw InvalidAgeException
		} catch (InvalidAgeException e) { 
			System.err.println("Exception caught: " + e.getMessage());
		}
		
		try {
			voter.checkEligibility(19); // This will throw InvalidAgeException
		} catch (InvalidAgeException e) { 
			System.err.println("Exception caught: " + e.getMessage());
		}
	}

}
