package com.oops;

/*
 * Method overriding/run-time polymorphism :
 * To achieve method overriding we must have at least one
 * identical method between the classes with IS-A relationship
 */
public class MethodOverridingTest extends MethodOverloadTest{
	
	int a=100;
	int b=200;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of integer a and b in subclass is :" +c);
	}
	
	public static void subtraction(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b in subclass is :" +c);
	}
	
	void m1() {
		super.addition(); // call to super class addition method
		this.addition();  // call to super class addition method
	}
	
	public MethodOverridingTest() {
		super(); // call to a parent class constructor
		System.out.println("No argument constructor..!");
	}
	
	
	public static void main(String[] args) {
		MethodOverridingTest mot = new MethodOverridingTest();
		mot.addition();
		mot.m1();
		subtraction(90, 20);
	}

}
