package com.access.modifiers.outside;

import com.access.modifiers.ProtectedTest;
import com.access.modifiers.PublicTest;

public class ProtectedOutsidePackageTest extends ProtectedTest{
	
	public static void main(String[] args) {
		System.out.println("Accessing protected contructor, variable and methods from a different package");
		//ProtectedTest pt = new ProtectedTest();
		//pt.add();
		//System.out.println(pt.a);
		//System.out.println(pt.b);
		
		ProtectedOutsidePackageTest pot = new ProtectedOutsidePackageTest();
		pot.add();
		System.out.println(pot.a);
		System.out.println(pot.b);
	
	}

}
