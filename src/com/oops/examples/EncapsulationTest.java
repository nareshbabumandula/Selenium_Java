package com.oops.examples;

public class EncapsulationTest {

	public static void main(String[] args) {

		EncapsulationDemo cap = new EncapsulationDemo();
		cap.setUsername("nishanth");
		System.out.println(cap.getUsername());
		
		cap.setPassword("selenium123");
		System.out.println(cap.getPassword());
	
		cap.admin ="naresh";
		System.out.println(cap.admin);
		
	}


}
