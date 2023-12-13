package testCasePackage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import Page_Package.SelectandPlaceOrder;
import Page_Package.baseClass;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class SelectandPlaceOrderTestCases extends baseClass{

	WebDriver driver;
	SelectandPlaceOrder spo;
	
	@BeforeTest
	public void startbrowser()
	{
		driver= super.BrowserSetup();
		spo = new SelectandPlaceOrder(driver);
		
	}
	
	
	@Test (priority = 1, description = "Order_TC001", enabled = true, invocationCount = 1)
	@Description("Verify that user is able to place order of Apple Note Book sucessfully")
	@Epic("Order_EP001")
	@Feature("Order_001")
	@Story("Verify that user is able to place order of Notebooks")
	@Step("Login -> Home -> Select Computers Category -> Select Notebook -> Select Any Product")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void VerifyPlaceOrderOfNoteBook(){
		spo.selectNoteBook();
	}
	

	@Test (priority = 2, description = "Order_TC002", enabled = true, invocationCount = 1)
	@Description("Verify that user is able to place order of Electronics sucessfully")
	@Epic("Order_EP001")
	@Feature("Order_002")
	@Story("Verify that user is able to place order of Electronics")
	@Step("Login -> Home -> Select Electronics Category -> Select Electronics -> Select Any electronics")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void VerifyPlaceOrderOfElectronics(){
		spo.SelectElectronics();
	}
	

	@Test (priority = 3, description = "Order_TC003", enabled = true, invocationCount = 1)
	@Description("Verify that user is able to place order of Jewelry sucessfully")
	@Epic("Order_EP001")
	@Feature("Order_003")
	@Story("Verify that user is able to place order of Electronics")
	@Step("Login -> Home -> Select Jewelry Category -> Select Any product")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void VerifyPlaceOrderOfJewelry() {
		spo.SelectJewelry();
		spo.ViewCart();
	}
	
	@Test (priority = 4, description = "CheckOut_C001", enabled = true, invocationCount = 1)
	@Description("Verify that user can Checkout")
	@Epic("Order_EP001")
	@Feature("CheckOut_C001")
	@Story("Verify that user is able to Checkout")
	@Step("Click on Checkout button")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void VerifyUserCanCheckOut() {
		spo.checkOut();
	}
	
	@Test (priority = 5, description = "CheckOut_C002", enabled = true, invocationCount = 1)
	@Description("Verify if user is not logged in then enter Email and Password")
	@Epic("Order_EP001")
	@Feature("CheckOut_C002")
	@Story("Verify that user can login")
	@Step("If user is not logged in then enter Email and Password")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void login() {
		spo.login();
	}
	@Test (priority = 6, description = "CheckOut_C004", enabled = true, invocationCount = 1)
	@Epic("Order_EP001")
	@Feature("CheckOut_C004")
	@Story("Checkout")
	@Step("Click on Checkout button")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void CheckOutAgain()
	{
		spo.CheckOutAgain();
	}
	@Test (priority = 7, description = "CheckOut_C005", enabled = true, invocationCount = 1)
	@Epic("Order_EP001")
	@Feature("CheckOut_C005")
	@Story("Add Check out details")
	@Step("Add Check out Details")
	@Severity(SeverityLevel.CRITICAL)
	@Attachment()
	public void AddCheckOutDetails() {
		spo.AddCheckOutDetails();
	}
	
	
		
	}
