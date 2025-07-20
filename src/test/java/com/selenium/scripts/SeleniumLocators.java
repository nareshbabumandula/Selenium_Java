package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		// Absolute XPath - Starts from the root node (html) with a preceding single slash "/"
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).sendKeys("Kalyani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).clear();
		
		// Relative xpath - Starts from the node of our choice with a preceding single slash "//"
		driver.findElement(By.xpath("//div/form/fieldset/div/input")).sendKeys("Sampath");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/form/fieldset/div/input")).clear();
		Thread.sleep(4000);
		driver.quit();
	}

}
