package com.webdriver.scripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TakeScreenshotTest {

	WebDriver driver;

	@BeforeClass() //@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void textBoxMethods() throws InterruptedException, IOException {


		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user")));
		WebElement username = driver.findElement(By.id("user"));

		System.out.println("Name attribute value is : " + username.getAttribute("name"));
		System.out.println(username.getTagName());
		System.out.println(username.getAttribute("class"));
		System.out.println(username.getAttribute("id"));
		System.out.println(username.getAttribute("type"));
		System.out.println(username.getAttribute("tabindex"));
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());

		username.sendKeys("rajesh"); // Hard coding
		Thread.sleep(2000);
		username.clear();
		username.sendKeys("nishanth");

		// Take Screenshot
		//Convert driver object to TakeScreenshot
		TakesScreenshot scrShot =(TakesScreenshot)driver;

		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination
		File DestFile=new File(".\\Files\\Screenshots\\Image1.png");

		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

		System.out.println(username.getAttribute("value"));
		String actValue = username.getAttribute("value");
		/*
		 * if (actValue.equals("nishanth")) {
		 * Reporter.log("Expected value is matching with the actual value : " +
		 * actValue); } else {
		 * Reporter.log("Expected value is not matching with the actual value : " +
		 * actValue); }
		 */
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertEquals(true, false);
		Assert.assertEquals(actValue, "nishanth", "Failed to enter the data in Username text field");
		Thread.sleep(2000);
		username.sendKeys(Keys.BACK_SPACE);
		Reporter.log("Successfully entered data in textbox");
	}

	@Test
	public void sampleForm() {
		System.out.println("Successfully filled the sample form..!");
	}

	@AfterClass //@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); //Tear down operation
	}



}
