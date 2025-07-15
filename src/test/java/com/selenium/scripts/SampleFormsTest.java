package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

public class SampleFormsTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyLogin("naresh", "Testing123");

		driver.findElement(By.linkText("Sample Forms")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.id("subject")).sendKeys("Test Subject");
		Thread.sleep(4000);
		driver.quit();
	}

}
