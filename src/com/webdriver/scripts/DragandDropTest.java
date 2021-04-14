package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragandDropTest {
	
	WebDriver driver;

	@Test
	public void ActionMethods() throws InterruptedException {
		
		Actions builder = new Actions(driver);
		
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // Switch the WebDriver to frame based on WebElement
		
		WebElement drag = driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(drag, 214, 75).perform(); // Drag the webelement at a given position
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); // Switch the WebDriver focus to outside the frame
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0); 
		WebElement source  = driver.findElement(By.id("draggable"));
		WebElement target  = driver.findElement(By.id("droppable"));
		
		builder.dragAndDrop(source, target).perform();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); 
		driver.findElement(By.linkText("Autocomplete")).click();
		driver.switchTo().frame(0); 
		WebElement tags = driver.findElement(By.id("tags"));
		
		
		// 1. Inside perform method there will be a build method
		// 2. perform method : A convenience method for performing the actions without calling build() first.
		// 3. build method is used to create chain of action or operation. build generated a composite action containing all actions so far, ready to be performed
		
	
		Action seriesofActions;
		seriesofActions = builder.sendKeys(tags, "Selenium").sendKeys(Keys.SPACE).sendKeys("Training").build();
		seriesofActions.perform();
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
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
