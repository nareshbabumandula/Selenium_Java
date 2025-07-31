package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SeleniumLocatorsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();

		/*
		 * Selenium Locators: Locators are nothing but the prime properties used for locating an object/webelement in the application under test.
		 * 1. id
		 * 2. name
		 * 3. className
		 * 4. cssSelector
		 * 5. linkText
		 * 6. partialLinkText
		 * 7. tagName
		 * 8. xpath
		 */

		// 1. id
		driver.findElement(By.id("user")).sendKeys("Srikanth");
		Thread.sleep(2000);
		driver.findElement(By.id("user")).clear();

		// 2. name
		driver.findElement(By.name("user")).sendKeys("Kalyani");
		Thread.sleep(2000);
		driver.findElement(By.name("user")).clear();

		// 3. className
		driver.findElement(By.className("txt_log")).sendKeys("Greeshma");
		Thread.sleep(2000);
		driver.findElement(By.className("txt_log")).clear();

		// 4. cssSelector
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Naresh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user']")).clear();

		// 5. linkText
		driver.findElement(By.linkText("Sample Forms")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		// 6. partialLinkText
		driver.findElement(By.partialLinkText("Sample")).click();
		
		// 7. tagName
		driver.findElement(By.tagName("input")).sendKeys("Shiva");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		
		// 8. xpath
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Praveen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']")).clear();
		
		// Relative Locators: above, below, toLeftOf and toRightOf
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement username = driver.findElement(with(By.tagName("input")).above(password));
		username.sendKeys("Kiran");
		Thread.sleep(2000);
		

		Thread.sleep(4000);
		driver.quit();
	}

}
