package com.oops.examples;

public class ClassC extends ClassB{

	// a and b are variables also called as attributes or characteristics
	public int a=10;
	public int b=20;

	// Behavior or method
	public void division() {
		int c=b/a;
		System.out.println("Division of a and b is :  " + c);
	}

	public static void main(String[] args) {

		ClassC cc = new ClassC();
		cc.addition();
		cc.subtraction();
		cc.multiplicaion();
		cc.division();
		System.out.println(cc.a);
		System.out.println(cc.b);


	}

}
