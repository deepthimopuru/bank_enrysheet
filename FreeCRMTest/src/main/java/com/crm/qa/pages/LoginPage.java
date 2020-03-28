package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.testBase;



public class LoginPage extends testBase {
	
	
	//page factory OR
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//a[@text(),'Classic CRM']")
	WebElement classicBtn;
	
	


//initializing the page objects
public LoginPage() {
	
	PageFactory.initElements(driver, this);
	
}

//actions


public String validateLoginPageTitle() {
	return driver.getTitle();
	
}

public HomePage  login(String em, String pass)
{
	email.sendKeys(em);
	password.sendKeys(pass);
	
	loginBtn.click();
	
	
	return new HomePage();
	
}


	
	



	






}

	

