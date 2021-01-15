package com.access.modifiers;

public class PublicTest {
	
	// public variables
	public String Username = "admin";
	public String Password = "Secure*1234";
	public String URL = "https://www.mycontactform.com/";
	
	// public methods
	public void AccessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	public void Login() {
		System.out.println("Successfully logged into the application with the User : " + Username);
	}
	
	public void logout() {
		System.out.println("Logged out successfully from the application");
	}
	
	// public constructor
	public PublicTest() {
		System.out.println("This is a public constructor");
	}
	

	public static void main(String[] args) {
		
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
		
	}

}
