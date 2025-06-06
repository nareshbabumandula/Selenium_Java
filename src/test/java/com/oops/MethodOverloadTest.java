package com.oops;

public class MethodOverloadTest {
	
	// Instance variables or data members
	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addtion of integer a and b is :" +c);
	}
	
	void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addtion of integer a, b and c is :" +d);
	}
	
	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition();
		mot.addition(100, 200, 300);
	}

}
