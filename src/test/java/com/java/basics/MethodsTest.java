package com.java.basics;

public class MethodsTest {

	// Method is not but a block of code which gets executed only when we call it.
	// Here m1 is a method which accepts no arguments/parameters and which has no return value
	void m1() {
		System.out.println("Executing m1 method..!");
	}

	// Here m2 is a method which accepts one string argument/parameter and which has no return value
	void m2(String sText) {
		System.out.println("Executing m2 method..! " + sText);
	}

	// Here m3 is a method which accepts no arguments/parameters and which has integer as a return type
	int m3() {
		System.out.println("Executing m3 method..! ");
		return 1;
	}

	// Here m4 is a method which accepts no one integer parameter and which has String as a return type
	String m4(int a) {
		if (a%2==0) {
			return a + " is an even number";
		} else {
			return a + " is an odd number";
		}
	}

	public static void main(String[] args) {
		// Classname objReferenceName = new Constructor();
		MethodsTest mt  = new MethodsTest();
		mt.m1(); // calling m1 method
		mt.m2("Pass"); // calling m2 method
		int res = mt.m3();
		System.out.println("Output /return value from method m3 is :" + res);
		String result = mt.m4(3);
		System.out.println(result);
	}

}
