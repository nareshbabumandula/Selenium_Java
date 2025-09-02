package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusFooterLinksTest {

	static WebDriver driver;

	public void getFooterLinks(String strHeading) throws InterruptedException {
		try {
			driver = new ChromeDriver();
			driver.get("https://redbus.in");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			WebElement aboutRedbus = driver.findElement(By.xpath("//h2[contains(text(), 'About redBus')]"));
			System.out.println(aboutRedbus.isDisplayed());

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", aboutRedbus);
			Thread.sleep(4000);

			List<WebElement> links = driver.findElements(By.xpath("//h2[contains(text(), '"+strHeading+"')]/parent::div/div/a"));
			for (WebElement link : links) {
				System.out.println(link.getText());			
			}
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RedBusFooterLinksTest redbusFooterLinks = new RedBusFooterLinksTest();
		redbusFooterLinks.getFooterLinks("Our Partners");
	}

}
