package com.access.modifiers;

public class PublicOutsideClassTest extends PublicTest{
	
		
	public static void main(String[] args) {
		System.out.println("Accessing public contructor, variable and methods from a different class within the same package");
		PublicTest pt = new PublicTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
		
		PublicOutsideClassTest poc = new PublicOutsideClassTest();
		poc.add();
		System.out.println(poc.a);
		System.out.println(poc.b);
		
	}

}
