package com.webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.object.repository.SampleEmailForms;

public class LocatorsTestwithPOM extends SampleEmailForms{
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.findElement(SampleForms).click(); // Page Object Model Scripting
		driver.findElement(SendTo).click();
		driver.findElement(Subject).sendKeys("Test Subject"); 
		driver.findElement(EmailAddress).sendKeys("nishanth@gmail.com");
		driver.findElement(TestField).sendKeys("Test Field"); 
		driver.findElement(Description).sendKeys("Test Description"); 
		
		SampleEmailForms sef = PageFactory.initElements(driver, SampleEmailForms.class);
		firstOption.click(); // Page Factory pattern with WebDriver
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
