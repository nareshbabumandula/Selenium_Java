package com.testng.scripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonDependsOnMethodsTest {
	
	/**
	 * The annotated method will be run before all tests in this suite have run.
	 */
	@BeforeSuite 
	void launchBrowser() {
		System.out.println("Launched the browser..!");
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
				
	@Test
	void searchProduct() {
		System.out.println("Successfully searched the product..!");
	}
	
	@Test(dependsOnMethods = {"searchProduct"})
	void addToCart() {
		System.out.println("Added the product to cart..!");
	}
	
	@Test(dependsOnMethods = {"addToCart"})
	void checkOut() {
		System.out.println("Checkedout the product..!");
	}
	
	@Test(dependsOnMethods = {"checkOut"})
	void proceedtoPay() {
		System.out.println("Navigated to proceed to buy page..!");
	}
	
	@Test(dependsOnMethods = {"proceedtoPay"})
	void payment() {
		System.out.println("Order placed successfully..!");
	}
	
	@Test(dependsOnMethods = {"payment"})
	void receipt() {
		Assert.assertEquals(true, true);
		System.out.println("Order receipt generated..!");
	}
	
	// alwaysRun: If set to true, this test method will always be run even if it depends on a method that failed.
	@Test(dependsOnMethods = {"receipt"}, alwaysRun = true)
	void cancelOrder() {
		System.out.println("Successfully cancelled the order..!");
	}
	
	@Test(enabled = true, invocationCount = 4, timeOut = 3000)
	void navigatetoHomepage() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Navigated to the homepage..!");
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
