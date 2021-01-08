package com.oops.examples;

public class EncapsulationDemo {
	
	private String username = "rajesh";
	private String password = "Secure*1234";
	private String email = "rajesh123@gmail.com";
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// Code or logic which can validate the email address
		this.email = email;
	}

	public String admin = "admin123";
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
