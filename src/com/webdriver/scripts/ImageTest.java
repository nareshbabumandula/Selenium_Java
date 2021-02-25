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

public class ImageTest {
	
	WebDriver driver;

	@Test
	public void imageMethods() throws InterruptedException {
		
		WebElement sampleforms = driver.findElement(By.className("test_img"));
		
		System.out.println(sampleforms.getAttribute("src"));
		System.out.println(sampleforms.getAttribute("alt"));
		System.out.println(sampleforms.getAttribute("class"));
		System.out.println(sampleforms.getTagName());
		System.out.println(sampleforms.isDisplayed());
		System.out.println(sampleforms.isEnabled());
		sampleforms.click();
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
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
