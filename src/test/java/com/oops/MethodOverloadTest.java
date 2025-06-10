package com.oops;

public class MethodOverloadTest {
	
	 // Instance variables or data members
	int a=10;
	int b=20;
	static int d=30;
	
	/*
	 * Method overloading/compile-time polymorphism :
	 * To achieve method overloading we must have more than one
	 * method in a class with same name but with different signature. 
	 */
	void addition() {
		int c=a+b;
		System.out.println("Addition of integer a and b is :" +c);
	}

	void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of integer a, b and c is :" +d);
	}
	
	void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition of double a and b is :" +c);
	}
	
	// parameterized constructor
	public MethodOverloadTest(int a, int b) {
		System.out.println("Executing the parameterized constructor with parameters : " + a + "," + b);
	}
	
	// no argument constructor
	public MethodOverloadTest() {
		System.out.println("Executing no argument constructor..!");
	}
	
	// If there is no constructor defined inside a class then java compiler will create a default constructor

	// static method and it belongs to a class
	public static void subtraction() {
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println("Subtraction of a and b is :" +c);
	}
	
	public static void subtraction(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b is :" +c);
	}
	
	
	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition(); // instance method call
		mot.addition(100, 200, 300);
		mot.addition(342.35435, 435.3453463);
		subtraction(); // static method call
		System.out.println(d);
		MethodOverloadTest.subtraction();
		System.out.println(mot.a);
		System.out.println(mot.b);
		subtraction(70, 30);
	
		MethodOverloadTest mo = new MethodOverloadTest(50, 80);
		
	}

}
