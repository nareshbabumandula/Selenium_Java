package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();

		// Absolute XPath - Starts from the root node (html) with a preceding single slash "/"
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div[1]/input")).sendKeys("Kalyani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div[1]/input")).clear();

		// Relative xpath - Starts from the node of our choice with a preceding double slash "//"
		driver.findElement(By.xpath("//div/form/fieldset/div[1]/input")).sendKeys("Sampath");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/form/fieldset/div[1]/input")).clear();

		// Relative xpath with attribute -- Syntax --> //html tag[@attribute='value']
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Surender");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user']")).clear();

		// Relative xpath with AND keyword -- Syntax --> //html tag[@attribute1='value' and @attribute2='value']
		driver.findElement(By.xpath("//input[@id='user' and @name='user']")).sendKeys("Srinivasulu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user' and @name='user']")).clear();

		// Relative xpath with OR keyword -- Syntax --> //html tag[@attribute1='value' or @attribute2='value']
		driver.findElement(By.xpath("//input[@id='user' or @name='user']")).sendKeys("Sneha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user' or @name='user']")).clear();

		// Relative xpath with starts-with function
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).sendKeys("Shiva");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).clear();

		// Relative xpath with contains function
		driver.findElement(By.xpath("//input[contains(@id,'use')]")).sendKeys("Ravi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'use')]")).clear();

		List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='header']/ul/li/a"));
		for (WebElement menutab : tabs) {
			System.out.println(menutab.getText());
		}
		
		driver.navigate().to("https://www.amazon.co.in");
		
		List<WebElement> menutabs = driver.findElements(By.xpath("//div[@class='nav-div']/a"));
		for (WebElement tab : menutabs) {
			System.out.println(tab.getText());
		}
		
		driver.navigate().to("https://www.mycontactform.com");
			
		
		Thread.sleep(4000);
		driver.quit();
	}

}
