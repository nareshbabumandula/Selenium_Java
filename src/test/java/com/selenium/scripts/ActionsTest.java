package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
			driver.get("https://www.ghmc.gov.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
			Actions actions = new Actions(driver);
			WebElement onlineServices = driver.findElement(By.linkText("Online Services"));
			Thread.sleep(3000);
			
			// mouse over on Online Services link and perform click operation
			actions.moveToElement(onlineServices).click().perform();
			WebElement propertyTax = driver.findElement(By.linkText("Property Tax"));
			// mouse over on Property Tax link and perform click operation
			actions.moveToElement(propertyTax).click().perform();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Door No Correction")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}

}
