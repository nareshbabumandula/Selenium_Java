package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
	
	@Test
	public void SearchProduct() {
		System.out.println("Successfully searched the product..!");
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
