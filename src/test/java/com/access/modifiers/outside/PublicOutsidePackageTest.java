package com.access.modifiers.outside;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackageTest {
	
	public static void main(String[] args) {
		System.out.println("Accessing public contructor, variable and methods from a different package");
		PublicTest pt = new PublicTest();
		pt.add();
		System.out.println(pt.a);
		System.out.println(pt.b);
	}

}
