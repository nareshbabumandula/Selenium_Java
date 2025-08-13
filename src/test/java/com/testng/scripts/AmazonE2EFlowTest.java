package com.testng.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonE2EFlowTest {
	
	/**
	 * The annotated method will be run before all tests in this suite have run.
	 */
	@Parameters("url")
	@BeforeSuite 
	void accessSite(String url) {
		System.out.println("Successfully accessed the URL: " + url);
	}
	
	/**
	 * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the 
	 * <test> tag is run
	 */
	@BeforeTest
	void userRegistration() {
		System.out.println("User registered successfully..!");
	}
	
	/**
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	 */
	@BeforeClass
	void login() {
		System.out.println("User logged in successfully..!");
	}
	
	/**
	 * @BeforeMethod: The annotated method will be run before each test method.
	 */
	@BeforeMethod
	public void verifyUserLoggedIn() {
		System.out.println("Verified user logged in..!");
	}
	
	/**
	 * @AfterMethod: The annotated method will be run after each test method.
	 */
	@AfterMethod
	public void verifyQuantity() {
		System.out.println("Verify Product Quantity..!");
	}
		
	
	@Test(priority = 1)
	void searchProduct() {
		System.out.println("Successfully searched the product..!");
	}
	
	@Test(priority = 2)
	void addToCart() {
		System.out.println("Added the product to cart..!");
	}
	
	@Test(priority = 3)
	void checkOut() {
		System.out.println("Checkedout the product..!");
	}
	
	@Test(priority = 4)
	void proceedtoPay() {
		System.out.println("Navigated to proceed to buy page..!");
	}
	
	@Test(priority = 5)
	void payment() {
		System.out.println("Order placed successfully..!");
	}
	
	@Test(priority = 6)
	void receipt() {
		System.out.println("Order receipt generated..!");
	}
	
	@Test(priority = 7)
	void cancelOrder() {
		System.out.println("Successfully cancelled the order..!");
	}
	
	/**
	 * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	 */
	@AfterClass
	void refunds() {
		System.out.println("Generated Refund..!");
	}
	
	/**
	 * @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the 
	 * <test> tag have run.
	 */
	@AfterTest
	void logout() {
		System.out.println("Logged out from the application..!");
	}
	
	/**
	 * @AfterSuite: The annotated method will be run after all tests in this suite have run.
	 */
	@AfterSuite
	void closeBrowser() {
		System.out.println("Closed the browser..!");
	}
	

}
