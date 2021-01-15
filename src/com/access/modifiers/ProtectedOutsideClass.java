package com.access.modifiers;

public class ProtectedOutsideClass {

	public static void main(String[] args) {
		
		System.out.println("Accessing protected access modifiers from different the class");
		
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
	}

}
