package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@href='https://www.crmpro.com/register/']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[@src='https://d3lh3kd7bj2evy.cloudfront.net/img/logo.png']")
	WebElement crmLogo;
	//initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	//actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
		
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}

}
