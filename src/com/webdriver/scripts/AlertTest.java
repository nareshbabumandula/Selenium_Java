package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertTest {
	
	WebDriver driver;

	@Test
	public void alertMethods() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//alert.accept(); // Click on deafult button in the alert popup window
		Thread.sleep(2000);
		alert.dismiss();
	}
	
	@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); //Tear down operation
	}
	

	@BeforeClass //@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
