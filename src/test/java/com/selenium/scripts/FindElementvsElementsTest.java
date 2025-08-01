package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * findElement: 
 * 1. It will try to find the firstly found WeblElement in the page
 * 2. If the WebElement is not found this method throws NoSuchElementException
 * 3. Return type for findElement method is WebElement
 * 
 * findElements: 
 * 1. It will try to find the list of WeblElements in the page 
 * 2. If not found this method returns an empty list of size 0
 * 3. Return type for findElements method is List<WebElement>
 *
 */
public class FindElementvsElementsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Testimonials")).click();
		//driver.findElement(By.linkText("Testimonials123")).click(); // Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Testimonials123"}
		
		driver.findElement(By.linkText("Testimonials")).click();
		//driver.findElement(By.linkText("Testimonials123")).click(); // Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Testimonials123"}
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of links found are: " + links.size());
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		List<WebElement> nlinks= driver.findElements(By.tagName("a123"));
		System.out.println("No of links found are: " + nlinks.size());
		
		Thread.sleep(5000);
		driver.quit();
	}

}
