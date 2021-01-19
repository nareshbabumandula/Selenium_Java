package com.oops.examples;

public class ClassA {

	// a and b are variables also called as attributes or characteristics
	// Data members
	public int a=10;
	public int b=20;

	// Behavior or method
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is :  " + c);
	}

	// Constructor - Special method in Java 
	// It is responsible for constructing the variables and methods and to allocate memory
	// Constructor name should be the same name as class name
	// Constructor will not return anything

	// No argument constructor
	public ClassA() {
		System.out.println("This is a no argument constructor of ClassA");
	}
	
	// Parameterized Constructor
	public ClassA(int a, int b) {
		System.out.println("This is an parameterized constructor of ClassA with params : " + a + " , " + b);
	}
	

	public static void main(String[] args) {

		ClassA obj = new ClassA(); // Created object for the ClassA
		obj.addition();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.toString());
	
		
	}

}
