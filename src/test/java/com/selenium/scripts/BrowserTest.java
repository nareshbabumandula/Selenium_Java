package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.mycontactform.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("user")).sendKeys("Manoja");
	  Thread.sleep(1000);	  
	  driver.findElement(By.id("pass")).sendKeys("Ignore*123");
	  Thread.sleep(1000);
	  driver.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(3000);
	  driver.quit();

	}

}
