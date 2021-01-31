package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ProfilePage1;
import com.crm.qa.pages.SearchPage;
import com.crm.qa.pages.SearchResultsPage;


public class SendMessageTest extends TestBase{
	LoginPage loginPage;
	SearchPage searchPage;
	SearchResultsPage searchResultsPage;
	ProfilePage1 profilePage = new ProfilePage1(driver);
	
	
	public SendMessageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
	}
	
	@Test
	public void sendMessageTest() throws InterruptedException {
		loginPage=new LoginPage();
		searchPage=new SearchPage();
		searchResultsPage = new SearchResultsPage();
		searchPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
	    searchPage.search("profectus kamaljeet"); 
	    searchPage.sendmessage();
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {	
	Thread.sleep(3000);
	driver.quit();
	
	}
	
}
