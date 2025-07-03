package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	WebDriver driver;

	void accessSite() {
		driver.get("https://www.mycontactform.com");
		String strBrowserTitle = driver.getTitle();
		System.out.println(strBrowserTitle);

		// Checkpoint or verification
		if(strBrowserTitle.contains("Free Contact and Email Forms")) {
			System.out.println("MyContactForm page title is correct");
		}else {
			System.out.println("MyContactForm page title is incorrect");
		}
	}
	
	void launchBrowser(String browserName) {
		
		switch (browserName.toLowerCase().trim()) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser..!");
			break;
		}
	}
	
	void login() throws InterruptedException {
		driver.manage().window().maximize();
		driver.findElement(By.id("user")).sendKeys("Manoja");
		Thread.sleep(1000);	  
		driver.findElement(By.id("pass")).sendKeys("Ignore*123");
		Thread.sleep(1000);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// Classname objReferenceName = new Constructor();
		BrowserTest bt = new BrowserTest();
		bt.launchBrowser("firefox");
		bt.accessSite();
		bt.login();
	}

}
