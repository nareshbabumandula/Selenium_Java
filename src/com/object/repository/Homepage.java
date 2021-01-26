package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

	public static By userName = By.name("user");
	
	@FindBy(id="user")
	WebElement txtUser;
	
	@FindBy(id="pass")
	WebElement txtPassword;
	
	@FindBy(how=How.NAME, using="btnSubmit")
	@CacheLookup
	private WebElement btnSubmit;
	
	public void verifyLogin() {
		
		txtUser.sendKeys("naresh223");
		txtPassword.sendKeys("selenium");
		btnSubmit.click();
		
	}
	

}
