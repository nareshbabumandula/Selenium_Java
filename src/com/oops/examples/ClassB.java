package com.oops.examples;

public class ClassB extends ClassA{
		
	public int a=20;
	public int b=40;
	
	public void subtraction() {
		int c=b-a;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	public void multiplication() {
		int c=a*b;
		System.out.println("Multiplicaion of a and b is : " +c);
	}
	
	public static void main(String[] args) {
		
		// Create an object reference for ClassB
		ClassB cb = new ClassB();
		cb.subtraction();
		cb.multiplication();
		System.out.println(cb.a);
		System.out.println(cb.b);
		cb.addition();

	}

}
