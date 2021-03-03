package com.testng.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsTest {
	
	@BeforeSuite()
	public void closeAllBrowsers() {
		System.out.println("Executing beforesuite method");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Executing aftersuite method");
	}	

	@Test(priority = 0, groups = {"smoke"})
	public void SearchProduct() {
		System.out.println("Successfully searched the product..!");
	}
	
	@Test(priority = 2, groups = {"smoke", "regression"})
	public void checkOut() {
		System.out.println("Successfully checked out the product..!");
	}
	
	@Test(priority = 1, groups = {"smoke", "regression"})
	public void AddToCart() {
		System.out.println("Successfully added the product to the cart..!");
	}
	
	@BeforeMethod
	public void getProduct() {
		System.out.println("Successfully retrieved the product name");
	}
	
	@AfterMethod
	public void checkProductAvailability() {
		System.out.println("Product stock availability verified");
	}
	
	@BeforeClass
	public void AccessSite() {
		System.out.println("Accessed the site");
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("Launched the browser");
	}
	
	@AfterTest
	public void CloseBrowser() {
		System.out.println("Closed the browser");
	}

	@AfterClass
	public void Logout() {
		System.out.println("Logged out from the application");
	}

}
