package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseOverTest {
	
	WebDriver driver;

	@Test
	public void imageMethods() throws InterruptedException {
		
		WebElement addons = driver.findElement(By.id("highlight-addons"));
		
		System.out.println(addons.getAttribute("id"));
		System.out.println(addons.getAttribute("href"));
		System.out.println(addons.getTagName());
		System.out.println(addons.getText());
		System.out.println(addons.isDisplayed());
		System.out.println(addons.isEnabled());
		
		Actions menu = new Actions(driver);
		
		menu.moveToElement(addons).perform(); // Hover the mouse on addons link using Actions class method - moveToElement
		driver.findElement(By.linkText("Hot Meals")).click();
		Thread.sleep(2000);
		menu.contextClick(addons).perform(); // Perform right click operation on Addons link
		Thread.sleep(2000);
	
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
