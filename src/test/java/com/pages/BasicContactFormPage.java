package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicContactFormPage {

	// Page Factory Elements
	@FindBy(name="q[1]")
	private WebElement yourName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="q[2]")
	private WebElement message;
		
	@FindBy(name="submit")
	private WebElement submit;
	
	public void submitBasicContactForm(String name, String emailAddress, String messageText) {
		yourName.sendKeys(name);
		email.sendKeys(emailAddress);
		message.sendKeys(messageText);
		submit.click();
	}
		
}
