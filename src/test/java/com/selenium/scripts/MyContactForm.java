package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyContactForm {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    driver.findElement(By.id("user")).sendKeys("Mangulal");
	    driver.findElement(By.id("pass")).sendKeys("Secure*123");
	    
	    Thread.sleep(4000);
		
		driver.quit();

	}

}
