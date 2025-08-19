package com.testng.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
		
	@DataProvider(name = "testdata")
	public Object[][] LoginData() {
	 return new Object[][] {
	   { "Greeshma", "Secure*123" },
	   { "Kalyani", "Ignorance123$"},
	   { "Charitha", "Intelligence*123"}
	 };
	}
	
	@Test(dataProvider = "testdata")
	public void testLogin(String username, String password) throws InterruptedException {
		driver.findElement(By.id("user")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
		System.out.println("Login successful with username : " + username + " and password " + password);
		driver.navigate().refresh();
	}

	@BeforeClass
	public void accessSite() {
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
