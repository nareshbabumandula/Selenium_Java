package com.access.modifiers;

public class DefaultTest {
	
	// default instance variable
	int a=10;
	int b=20;
	
	// no argument constructor
	DefaultTest() {
		System.out.println("This is a default constructor");
	}
		
	// method with no access modifier
	void add() {
		int c=a+b;
		System.out.println("default method add: " +  c);
	}
	
	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
