package com.webdriver.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListboxTest {
	
	WebDriver driver;

	@Test
	public void listboxMethods() throws InterruptedException {
	
		driver.findElement(By.linkText("Sample Forms")).click();
		
		WebElement canadianprovinces = driver.findElement(By.id("q10"));
			
		System.out.println(canadianprovinces.getAttribute("name"));
		System.out.println(canadianprovinces.getAttribute("id"));
		System.out.println(canadianprovinces.getTagName());
		System.out.println(canadianprovinces.isDisplayed());
		System.out.println(canadianprovinces.isEnabled());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid blue;');", canadianprovinces);
	
		Select listbox = new Select(canadianprovinces);
		listbox.selectByIndex(0);
		Thread.sleep(2000);
		listbox.selectByIndex(1);
		Thread.sleep(2000);
		listbox.selectByIndex(2);
		Thread.sleep(2000);
		listbox.selectByVisibleText("Yukon");
		
		List<WebElement> states = canadianprovinces.findElements(By.tagName("option"));
		System.out.println("No of states found in canadian provinces dropdown are : " + states.size());
		
		System.out.println("For Each Loop Started..!");
		for (WebElement state : states) {
			System.out.println(state.getText());
		}
		System.out.println("For Loop Started..!");
		for (int i = 0; i < states.size(); i++) {
			System.out.println(states.get(i).getText());
		}
		
		System.out.println("Applying Lambda on list collection - states");
		//Lambda on for each
		states.forEach((i)->System.out.println(i.getText()));
		

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
