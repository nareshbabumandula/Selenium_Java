package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class ParallelExecutionTest {
	
	WebDriver driver;
	
	@Test
	public void TC001() throws InterruptedException {
		System.out.println("Test case one with Thread Id : " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void TC002() throws InterruptedException {
		System.out.println("Test case two with Thread Id : " + Thread.currentThread().getId());
		System.setProperty("webdriver.ie.driver", ".\\browsers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void TC003() throws InterruptedException {
		System.out.println("Test case three with Thread Id : " + Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", ".\\browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		driver.quit();
	}


}
