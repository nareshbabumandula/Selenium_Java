package com.javascriptexector.examples;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

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
	public void javaScriptExecutorMethods() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('user').value='Himabindu'"); // Enter data in textbox using DOM method
		Thread.sleep(2000);
		WebElement USERNAME = driver.findElement(By.id("user"));
		js.executeScript("arguments[0].value='Nishanth'", USERNAME);
		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].click();", btnLogin);
		
		
	}
	


	@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); //Tear down operation
	}



}
