package com.access.modifiers;

public class PackageTest {
	
	// package/default variables
	String Username = "admin";
	String Password = "Secure*1234";
	String URL = "https://www.mycontactform.com/";
	
	// package/default methods
	void AccessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	void Login() {
		System.out.println("Successfully logged into the application with the User : " + Username);
	}
	
	void logout() {
		System.out.println("Logged out successfully from the application");
	}
	
	// package constructor
	PackageTest() {
		System.out.println("This is a package constructor");
	}
	

	public static void main(String[] args) {
		
		PackageTest pt = new PackageTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
		
	}

}
