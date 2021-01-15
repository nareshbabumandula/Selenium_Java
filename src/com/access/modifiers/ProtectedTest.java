package com.access.modifiers;

public class ProtectedTest {
	
	// protected variables
	protected String Username = "admin";
	protected String Password = "Secure*1234";
	protected String URL = "https://www.mycontactform.com/";
	
	// protected methods
	protected void AccessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	protected void Login() {
		System.out.println("Successfully logged into the application with the User : " + Username);
	}
	
	protected void logout() {
		System.out.println("Logged out successfully from the application");
	}
	
	// protected constructor
	protected ProtectedTest() {
		System.out.println("This is a protected constructor");
	}
	

	public static void main(String[] args) {
		
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
		
	}

}
