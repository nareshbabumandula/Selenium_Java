package com.access.modifiers;

public class PrivateTest {
	
	// private instance variable
	private int a=10;
	private int b=20;
	
	// no argument private constructor
	// To restrict object creation for a class outside we need to make its constructor as private
	private PrivateTest() {
		System.out.println("This is a private constructor");
	}
		
	// private method
	private void add() {
		int c=a+b;
		System.out.println("private method add: " +  c);
	}
	
	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
