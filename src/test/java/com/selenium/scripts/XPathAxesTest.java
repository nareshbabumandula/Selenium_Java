package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();

		//1. ancestor : These axes indicate all the ancestors relative to the context node, also reaching up to the root node
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='0']/ancestor::*"));

		//2. ancestor-or-self : This one indicates the context node and all the ancestors relativeto the context node, and includes the root node
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='0']/ancestor-or-self::*"));

		//3 attribute: This indicates the attributes of the context node. It can be represented with the �@� symbol.
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='0']")).click();

		//4. child: This indicates the children of the context node
		driver.findElement(By.xpath("//label[@for='subject']/child::span"));

		//5. descendant: This indicates the children, grand children, and their children (if any) of the context node. This does NOT indicate the Attribute and Namespace.
		List<WebElement> elements = driver.findElements(By.xpath("//table[@summary='This table contains contact form fields.']/descendant::input[@name='email_to[]']"));
		System.out.println("No of elements found are : " + elements.size());
		
		for (WebElement field : elements) {
			field.click();
		}

		//6. descendant-or-self: This indicates the context node and the children, and grand children and their children (if any) of the context node. This does NOT indicate the attribute and namespace.
		List<WebElement> nelements = driver.findElements(By.xpath("//table[@summary='This table contains contact form fields.']/descendant-or-self::input[@name='email_to[]']"));
		System.out.println("No of elements found are : " + nelements.size());
		
		//7. following: This indicates all the nodes that appear after the context node in theHTML DOM structure. This does NOT indicate descendant, attribute, and namespace.
		driver.findElement(By.xpath("//input[@id='user']/following::input"));
		
		//8. following-sibling: This one indicates all the sibling nodes (same parent as the context node) that appear after the context node in the HTML DOM structure. This does NOT indicate descendant, attribute, and namespace.
		driver.findElement(By.xpath("//input[@id='q4' and @value='First Option']/following-sibling::input"));
		
		//9. preceding-sibling: This one indicates all the sibling nodes (same parent as context node) that appear before the context node in the HTML DOM structure. This doesNOT indicate descendent, attribute, and namespace.
		driver.findElement(By.xpath("//input[@id='q4' and @value='Fifth Option']/preceding-sibling::input"));
		
		//10. parent: This indicates the parent of the context node.
		driver.findElement(By.xpath("//input[@id='q4' and @value='First Option']/parent::div"));
		
		//11. self: This one indicates the context node.
		driver.findElement(By.xpath("//input[@id='q4' and @value='First Option']/self::input"));
		
		Thread.sleep(4000);
		driver.quit();


	}

}
