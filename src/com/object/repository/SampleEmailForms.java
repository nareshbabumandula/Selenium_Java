package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleEmailForms {
	
	public static By SampleForms = By.linkText("Sample Forms");
	public static By SendTo = By.name("email_to[]");
	public static By Subject = By.id("subject");
	public static By EmailAddress = By.xpath("//input[contains(@id,'email')]");
	public static By TestField = By.cssSelector("input#q1");	
	public static By Description = By.tagName("textarea");
	
	@FindBy(id="q4")
	public static WebElement firstOption;
	
}
