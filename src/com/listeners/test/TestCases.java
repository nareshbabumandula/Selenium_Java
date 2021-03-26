package com.listeners.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;		

@Listeners(com.listeners.test.ListenerTest.class)
public class TestCases {	
	
	WebDriver driver;
				
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{		
		driver.get("http://demo.guru99.com/V4/");					
		driver.findElement(By.id("user")).sendKeys("naresh223");							
		driver.findElement(By.id("user")).sendKeys("Secure*12");							
		driver.findElement(By.name("btnSubmit")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
		System.out.println("This method to test fail");					
		Assert.assertTrue(false);			
	}	
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); //Tear down operation
	}
}