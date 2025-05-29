package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.mycontactform.com");
	  
	  String strBrowserTitle = driver.getTitle();
	  System.out.println(strBrowserTitle);
	  
	  // Checkpoint or verification
	  if(strBrowserTitle.contains("Free Contact and Email Forms")) {
		  System.out.println("MyContactForm page title is correct");
	  }else {
		  System.out.println("MyContactForm page title is incorrect");
	  }
	  
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
