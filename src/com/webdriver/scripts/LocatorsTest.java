package com.webdriver.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest{
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click(); // Identifying the webelement based on linkText locator
		driver.findElement(By.name("email_to[]")).click(); // Identifying the webelement based on name locator
		driver.findElement(By.id("subject")).sendKeys("Test Subject"); // Identifying the webelement based on ID locator
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("naresh223@gmail.com"); // Identifying the webelement based on ID locator with XPath
		driver.findElement(By.cssSelector("input#q1")).sendKeys("Test Field"); // Identifying the webelement based on CSS Selector locator 
		driver.findElement(By.tagName("textarea")).sendKeys("Test Description"); // Identifying the webelement based on tagname
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
