package com.access.modifiers;

public class ProtectedTest {
	
	// protected instance variable
	protected int a=10;
	protected int b=20;
	
	// no argument protected constructor
	protected ProtectedTest() {
		System.out.println("This is a protected constructor");
	}
		
	// protected method
	protected void add() {
		int c=a+b;
		System.out.println("protected method add: " +  c);
	}
	
	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
