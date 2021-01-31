package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="session_key")
	WebElement username;
	
	@FindBy(id="session_password")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Sign in']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	//actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public SearchPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new SearchPage();
	}

}
