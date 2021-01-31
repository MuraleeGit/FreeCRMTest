package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchPage extends TestBase{

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchfield;
	
	@FindBy(xpath="(//a[contains(@href, 'https://www.linkedin.com/in/kamaljeet-singh')])[1]")
	 public WebElement namefield;
	
	@FindBy(xpath="//a[normalize-space()='Message']")
	WebElement messagebutton;
	
	@FindBy(xpath="//div[@aria-label='Write a message…']//p")
	WebElement typemessage;
	
	@FindBy(xpath="//button[normalize-space()='Send']")
	WebElement sendmessage;
	
// initializing the page objects for the web pages	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	public SearchPage  search(String name) {
		searchfield.click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(name,Keys.ENTER);
		return new SearchPage();
	}
	
	public void sendmessage() {
		namefield.click();
		messagebutton.click();
		typemessage.sendKeys("Hi Kamaljeet, this is a test AUTO message");
		sendmessage.click();
	}
	
}

