package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableMethods {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		
		WebElement empTable = driver.findElement(By.xpath("//table[@id='t01']"));
		List<WebElement> nRows = empTable.findElements(By.xpath("tbody/tr"));
		System.out.println("No of rows in the table are : " + nRows.size());
		
		for (int i = 1; i < nRows.size(); i++) {
			
		}
		
		driver.quit();
	}

}
