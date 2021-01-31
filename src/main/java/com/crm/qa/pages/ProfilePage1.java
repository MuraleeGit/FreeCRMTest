package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ProfilePage1 extends TestBase{


	@FindBy(xpath="(//a[contains(@href, 'https://www.linkedin.com/in/kamaljeet-singh')])[1]")
	 public WebElement namefield;
	
	WebDriver driver;
// initializing the page objects	
	public ProfilePage1(WebDriver driver ) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void sendmessage() {
		namefield.click();
	
	}
	
}

