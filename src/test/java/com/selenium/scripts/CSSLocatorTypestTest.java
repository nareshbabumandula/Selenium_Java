package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorTypestTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();

		// absolute css path
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>div:nth-of-type(2)>div>form>fieldset>div:nth-of-type(1)>input")).sendKeys("naresh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>div:nth-of-type(2)>div>form>fieldset>div:nth-of-type(1)>input")).clear();

		// relative css path
		driver.findElement(By.cssSelector("fieldset>div:nth-of-type(1)>input")).sendKeys("shiva");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("fieldset>div:nth-of-type(1)>input")).clear();

		// CSS with starts-with
		driver.findElement(By.cssSelector("input[id^='us']")).sendKeys("Kalyani");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='us']")).clear();

		// CSS with ends-with
		driver.findElement(By.cssSelector("input[id$='er']")).sendKeys("Greeshma");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='er']")).clear();

		// CSS with contains
		driver.findElement(By.cssSelector("input[id*='se']")).sendKeys("Srikanth");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='se']")).clear();

		// CSS with # as a replacement for ID
		driver.findElement(By.cssSelector("input#user")).sendKeys("Nikitha");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user")).clear();

		// CSS with . as a replacement for class
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Charitha");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.txt_log")).clear();

		// CSS with and condition
		driver.findElement(By.cssSelector("input[id='user'][name='user']")).sendKeys("Kiran");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user'][name='user']")).clear();

		// CSS with or condition
		driver.findElement(By.cssSelector("input[id='user'],[name='user']")).sendKeys("Rajiv");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user'],[name='user']")).clear();

		Thread.sleep(4000);
		driver.quit();
	}

}
