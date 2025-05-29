package com.oops;

public class Arithmetic {

	int a, b;
	
	public Arithmetic(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	void add() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	void sub() {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	void mul() {
		int c=a*b;
		System.out.println("Multilication of a and b is : " +c);
	}
	
	void div() {
		int c=b/a;
		System.out.println("Division of a and b is : " +c);
	}
	
	void mod() {
		int c=b%2;
		System.out.println("Modulus of a and b is : " +c);
	}
	
	
	public static void main(String[] args) {
		Arithmetic arth = new Arithmetic(10, 20);
		arth.add();
		arth.sub();
		arth.mul();
		arth.div();
		arth.mod();
	}

}
