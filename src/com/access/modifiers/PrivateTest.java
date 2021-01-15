package com.access.modifiers;

public class PrivateTest {
	
	// private variables
	private String Username = "admin";
	private String Password = "Secure*1234";
	private String URL = "https://www.mycontactform.com/";
	
	// private methods
	private void AccessSite() {
		System.out.println("Successfully accessed the site : " + URL);
	}
	
	private void Login() {
		System.out.println("Successfully logged into the application with the User : " + Username);
	}
	
	private void logout() {
		System.out.println("Logged out successfully from the application");
	}
	
	// private constructor
	private PrivateTest() {
		System.out.println("This is a private constructor");
	}
	

	public static void main(String[] args) {
		
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.URL);
		System.out.println(pt.Username);
		System.out.println(pt.Password);
		
		pt.AccessSite();
		pt.Login();
		pt.logout();
		
	}

}
