package com.javascriptexector.examples;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

	WebDriver driver;

	@BeforeClass //@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void javaScriptExecutorMethods() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//Fetching the Domain Name of the site. Tostring() change object to name.		
		String DomainName = js.executeScript("return document.domain;").toString();			
		System.out.println("Domain name of the site = "+DomainName);	

		//Fetching the URL of the site. Tostring() change object to name	
		String url = js.executeScript("return document.URL;").toString();			
		System.out.println("URL of the site = "+url);		
		
		// Refresh the browser window
		js.executeScript("history.go(0)");
		
		//Method document.title fetch the Title name of the site. Tostring() change object to name		
		String TitleName = js.executeScript("return document.title;").toString();			
		System.out.println("Title of the page = "+TitleName);	
		Thread.sleep(2000);

		//Vertical scroll down by 600  pixels		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		//Vertical scroll up by 600  pixels		
		js.executeScript("window.scrollBy(600,0)");

		js.executeScript("document.getElementById('user').value='Himabindu'"); // Enter data in textbox using DOM method
		Thread.sleep(2000);
		WebElement USERNAME = driver.findElement(By.id("user"));
		js.executeScript("arguments[0].value='Nishanth'", USERNAME);
		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].click();", btnLogin);

		//Navigate to new Page i.e to generate access page. (launch new url)		
		js.executeScript("window.location = 'https://www.mycontactform.com/features.php'");
		Thread.sleep(2000);
		js.executeScript("window.location = 'https://www.mycontactform.com/samples.php'");
		WebElement txtSubject = driver.findElement(By.id("subject"));
		
		//Highlight element
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", txtSubject);
		js.executeScript("document.getElementById('subject').style.borderColor = 'Blue'");
		js.executeScript("arguments[0].value='Test Subject'", txtSubject);
		
		System.out.println(js.executeScript("return window.innerHeight;"));
		System.out.println(js.executeScript("return window.innerWidth;"));
			
		//Get InnerText of a Webpage
		String sText =  js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
		Thread.sleep(2000);
		js.executeScript("alert('Hello world');");

	}



	@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); //Tear down operation
	}



}
