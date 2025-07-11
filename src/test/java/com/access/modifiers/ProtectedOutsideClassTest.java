package com.access.modifiers;

public class ProtectedOutsideClassTest {
	
		
	public static void main(String[] args) {
		System.out.println("Accessing protected contructor, variable and methods from a different class within the same package");
		ProtectedTest pt = new ProtectedTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
