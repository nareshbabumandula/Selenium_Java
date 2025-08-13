package com.testng.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {
	
	/**
	 * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	 */
	@AfterClass
	public void logout(){
		System.out.println("Successfully logged out from the application");
	}
	
	/**
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	 */
	@BeforeClass
	public void userRegistration(){
		System.out.println("User registered successfully");
	}

	/**
	 * Marks a class or a method as part of the test.
	 */
	@Test(priority = 1)
	public void login(){
		System.out.println("User logged in successfully");
	}
	
	@Test(priority = 2)
	public void searchProduct(){
		System.out.println("Successfully searched the product");
	}
			
	@Test(priority = 3)
	public void addToCart(){
		System.out.println("Added product to the cart");
	}
	
	@BeforeMethod
	public void verifyUserLoggedIn() {
		System.out.println("Verified user logged in..!");
	}
	
	@AfterMethod
	public void verifyQuantity() {
		System.out.println("Verify Product Quantity..!");
	}
		

}
