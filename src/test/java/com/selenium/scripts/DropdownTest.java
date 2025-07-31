package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();
		
		WebElement predefinedCountries = driver.findElement(By.id("q9"));
	
		Select select = new Select(predefinedCountries);
		select.selectByIndex(1); // select the second option from the dropdown
		Thread.sleep(2000);
		select.selectByVisibleText("India");

		List<WebElement> countries = select.getOptions();
		
		for (WebElement country : countries) {
			System.out.println(country.getText());
			if(country.getText().equals("India")) {
				break;
			}
		}
		
		Thread.sleep(4000);
		driver.quit();
	}

}
