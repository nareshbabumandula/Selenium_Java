package com.access.modifiers.outside.pkg;

import com.access.modifiers.ProtectedTest;
import com.access.modifiers.PublicTest;

public class ProtectedOutsidePackage extends ProtectedTest{

	public static void main(String[] args) {
		
		System.out.println("Accessing protected access modifiers from outside the package");
		
		ProtectedOutsidePackage pop = new ProtectedOutsidePackage();
		pop.AccessSite();
		pop.Login();
		pop.logout();
		System.out.println(pop);
		System.out.println(pop.Username);
		System.out.println(pop.Password);
		
		
		/*
		 * ProtectedTest pt = new ProtectedTest(); System.out.println(pt.URL);
		 * System.out.println(pt.Username); System.out.println(pt.Password);
		 * 
		 * pt.AccessSite(); pt.Login(); pt.logout();
		 */
	}

}
