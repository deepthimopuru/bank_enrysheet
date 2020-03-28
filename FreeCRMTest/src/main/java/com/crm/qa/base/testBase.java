package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.testutil;

public class testBase {
	 public static WebDriver driver;
	public static Properties prop;
	 
	public testBase(){
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("/Users/pkd/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
			
			prop.load(ip);
			
		} 
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	
			
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("chrome")) {
			
			//System.setProperty("webdriver.chrome.driver","chromedriver");
			System.setProperty("webdriver.chrome.driver","chromedriver");
			
			 driver= new ChromeDriver();
			 
			 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
		
		
	}
	
	
	

}
