package com.testng.scripts;

public class AmazonOrderTest{

	public void userRegistration(){
		System.out.println("User registered successfully");
	}

	public void login(){
		System.out.println("User logged in successfully");
	}

	public void searchProduct(){
		System.out.println("Searched the product");
	}


	public static void main(String []args){
		AmazonOrderTest aot = new AmazonOrderTest();
		aot.userRegistration();
		aot.login();
		aot.searchProduct();
	}

}
