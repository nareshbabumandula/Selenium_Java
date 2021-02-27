package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ButtonTest {

	WebDriver driver;

	@BeforeClass //@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void buttonMethods() throws InterruptedException {

		WebElement login = driver.findElement(By.name("btnSubmit"));

		System.out.println(login.getTagName());
		System.out.println(login.getAttribute("class"));
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getAttribute("name"));
		System.out.println(login.getAttribute("value"));
		System.out.println(login.getAttribute("tabindex"));

		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		Assert.assertEquals(login.isEnabled(), true); // TestNG Assertion
		login.click();
		Reporter.log("Successfully clicked on a button");
	}
	
	@Test
	public void Demo() {
		System.out.println("Dummy method");
	}

	@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); //Tear down operation
	}



}
