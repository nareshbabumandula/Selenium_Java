package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="user")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;

	@FindBy(name="btnSubmit")
	public WebElement login;
	
	public void verifyLogin(String txtUsername, String txtPassword) {
		username.sendKeys(txtUsername);
		password.sendKeys(txtPassword);
		login.click();
	}

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
