package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonTest {
	
	WebDriver driver;

	@Test
	public void radiobuttonMethods() throws InterruptedException {
		
		WebElement trip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		
		System.out.println(trip.getAttribute("type"));
		System.out.println(trip.getAttribute("name"));
		System.out.println(trip.getAttribute("value"));
		System.out.println(trip.getTagName());
		System.out.println(trip.isDisplayed());
		System.out.println(trip.isEnabled());
		trip.click();
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
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
