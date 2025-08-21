package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="user")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;

	@FindBy(name="btnSubmit")
	private WebElement login;
	
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
