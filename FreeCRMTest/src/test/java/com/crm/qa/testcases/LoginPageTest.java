package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.testBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends testBase {
	
	  LoginPage loginpage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() 
	{
		
		initialization();
		
		 loginpage= new LoginPage();
		
		
	}
	
	@Test
	
	public void loginpagetitletest() {
		
	String title=loginpage.validateLoginPageTitle();
	
	Assert.assertEquals(title, "freecrm");
		
	}
	
	@Test
	public void logintest() 
	{
		loginpage.login(prop.getProperty("email"),prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
		
	public void teardown() {
		
		driver.quit();
		
	}

}
