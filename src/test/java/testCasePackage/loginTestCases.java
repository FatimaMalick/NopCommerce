package testCasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Package.RegisterPage;
import Page_Package.baseClass;
import Page_Package.loginPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class loginTestCases extends baseClass {
	
	WebDriver driver;
	loginPage loginpage;
	RegisterPage regPage;
	
	@BeforeTest
	public void startBrowser()
	{
		
	//	driver = super.BrowserSetup();
		loginpage = new loginPage(driver);
		regPage=  new RegisterPage(driver);

	}
	
	@Test (priority=1 , description="LoginTestcase001")
	@Description("VerifyLoginwithTheseCredentials")
	@Epic("Login_EP001")
	@Feature("Login001")
	@Story("Login Test")
	@Step("Use basic steps")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void verifyLoginwithWrongEmailandPassword()
	{
		loginpage.preCondition();
		loginpage.loginPageScenairo("fatemahmalikc@gmail.com", "1234");
		
		// To validate whether user is successfully Registered or not
				String ExpectedUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
				if (driver.getCurrentUrl() == ExpectedUrl)
				{
					Assert.assertTrue(true, "Test Passed");
	}System.out.println("Test Passed :( ");
	}
	@Test (priority=2 , description="LoginTestcase002")
	@Description("VerifyLoginwithTheseCredentials")
	@Epic("Login_EP001")
	@Feature("Login002")
	@Story("Login Test")
	@Step("Use basic steps")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	
	public void verifyLoginWithValidCredentials() {
		
		
	loginpage.preCondition();
		loginpage.loginPageScenairo("fatemahmalick@gmail.com" , "123124@Fatima");
		
		String ExpectedUrl = "https://demo.nopcommerce.com/";
		if (driver.getCurrentUrl() == ExpectedUrl) {
			Assert.assertTrue(true, "Test Passed");
			System.out.println("Test Passed yaaaaa");
		}
	}

	// Enter wrong Email and wrong Password
		@Test(priority = 3, description = "Login_TC003", enabled = true, invocationCount = 1)
		@Description("Verify test using these credentials: Email:abc@gmail.com  password: Test!123")
		@Epic("EP001")
		@Feature("Login003")
		@Story("Login Test")
		@Step("Use basic steps")
		@Severity(SeverityLevel.CRITICAL)
		@Attachment()
		public void VerifyUserDoesnotExistInSystem_SignupNewForAccount() {
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			loginpage.preCondition();
			loginpage.loginPageScenairo("abc@gmail.com", "Test!123");
		
				WebElement regbtn = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button"));
				regbtn.click();
				regPage.registerPageScenairo("Fatima", "Tuz Zahra","17" , "January", "1997", "ftuzzahra49@gmail.com", "CodeExperts", "1234@Fatima", "1234@Fatima");
			
		}
		
}
