package com.oops;

/*
 * Method overriding/run-time polymorphism :
 * To achieve method overriding we must have at least one
 * identical method between the classes with IS-A relationship
 */
public class MethodOverridingTest extends MethodOverloadTest{
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of integer a and b in subclass is :" +c);
	}
	
	void m1() {
		super.addition(); // call to super class addition method
	}
			
	public static void main(String[] args) {
		MethodOverridingTest mot = new MethodOverridingTest();
		mot.addition();
		mot.m1();
	}

}
