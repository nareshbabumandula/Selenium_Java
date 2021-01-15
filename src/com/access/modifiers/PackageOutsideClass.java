package com.access.modifiers;

public class PackageOutsideClass {

	public static void main(String[] args) {
		
		System.out.println("Accessing package access modifiers from different the class");
		
		PackageTest pt = new PackageTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
	}

}
