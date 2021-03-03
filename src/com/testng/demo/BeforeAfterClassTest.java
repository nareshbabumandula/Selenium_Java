package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClassTest {
	
	@Test
	public void SearchProduct() {
		System.out.println("Successfully searched the product..!");
	}

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Launched the browser");
	}

	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closed the browser");
	}

}
