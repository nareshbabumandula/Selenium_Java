package com.access.modifiers;

public class DefaultOutsideClassTest {
	
		
	public static void main(String[] args) {
		System.out.println("Accessing default contructor, variable and methods from a different class within the same package");
		DefaultTest pt = new DefaultTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
