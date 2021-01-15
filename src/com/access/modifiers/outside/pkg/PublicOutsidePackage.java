package com.access.modifiers.outside.pkg;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {
		
		System.out.println("Accessing the public access modifier from outside the package");
		
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
	}

}
