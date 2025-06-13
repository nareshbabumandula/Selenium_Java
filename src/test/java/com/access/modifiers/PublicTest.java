package com.access.modifiers;

public class PublicTest {
	
	// public instance variable
	public int a=10;
	public int b=20;
	
	// no argument public constructor
	public PublicTest() {
		System.out.println("This is a public constructor");
	}
		
	// public method
	public void add() {
		int c=a+b;
		System.out.println("public method add: " +  c);
	}
	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
