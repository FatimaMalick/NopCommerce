package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Package.RegisterPage;
import Page_Package.baseClass;
import Page_Package.loginPage;

public class registerTestCases {

	
	WebDriver driver;
	RegisterPage regpage;
	
	@BeforeTest
	public void startBrowser()
	{
		
	//	driver = baseClass.BrowserSetup();
		regpage = new RegisterPage(driver);
	
	}
	
	
	
	@Test 
	public void verifyLoginWithValidCredentials() 
	{
		regpage.preCondition();
		regpage.registerPageScenairo("Fatima", "Zahra", "17", "1", "1997", "ftuzzahra49@gmail.com", "CX", "12345@Fatima", "12345@Fatima");
regpage.postCondition();

	}

}
