package com.selenium.scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandlingTest {
    
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		
		String mainWindow = driver.getWindowHandle(); // returns the browser session ID
		System.out.println(mainWindow);
		driver.findElement(By.linkText("Fraud Awareness")).click();
		
		Set<String> windows = driver.getWindowHandles(); // returns the browser session ID's into Set collection
		System.out.println(windows);
		
		Iterator iter = windows.iterator();
	     
        while(iter.hasNext()){
            System.out.println(iter.next());
            String child = (String) iter.next();
            if(!mainWindow.equals(child)) {
            	driver.switchTo().window(child);
            	driver.findElement(By.xpath("//span[@class='cmp-linkList__item-title' and contains(text(),'Videos')]")).click();
            	Thread.sleep(4000);
            	driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("search-chatInput")).sendKeys("Personal Loan");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
