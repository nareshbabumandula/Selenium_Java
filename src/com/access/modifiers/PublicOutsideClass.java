package com.access.modifiers;

public class PublicOutsideClass {

	public static void main(String[] args) {
		
		System.out.println("Accessing public access modifier from different class");
		
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
	}

}
