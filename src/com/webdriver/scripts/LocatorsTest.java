package com.webdriver.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
	
	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.blazedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("home")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("bala@gmail.com");
		//driver.findElement(By.xpath("//form/div/div/input")).sendKeys("riya@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajeshsharma@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'emai')]")).sendKeys("himabindhu@hotmail.com");
		//driver.findElement(By.id("email")).sendKeys("naresh223@gmail.com");
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
