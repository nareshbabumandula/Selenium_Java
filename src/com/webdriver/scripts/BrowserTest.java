package com.webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import com.object.repository.Homepage;

public class BrowserTest extends Homepage{

	WebDriver driver;

	public void launchBrowser(String Browser, String Url) {

		switch (Browser.toLowerCase().trim()) {
		case "chrome": {
			System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "ie": {
			System.setProperty("webdriver.ie.driver", ".\\browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		case "ff": case "firefox" :{
			System.setProperty("webdriver.gecko.driver", ".\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		case "edge" : case "chromium": {
			System.setProperty("webdriver.edge.driver", ".\\browsers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
		default:
			System.out.println("Invalid browser..!");
		}
		driver.manage().window().maximize(); // Maximize the browser window
		driver.get(Url);
		//driver.findElement(By.id("user")).sendKeys("bala123"); // without POM
		//driver.findElement(userName).sendKeys("naresh223"); // with POM
		Homepage pf = new PageFactory().initElements(driver, Homepage.class);
		pf.verifyLogin();
		//verifyLogin(); // Login method call
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit(); // Terminate the browser
		
	}



	public static void main(String[] args) {

		BrowserTest bt = new BrowserTest();
		bt.launchBrowser("chrome", "https://www.mycontactform.com/");
	}

}
