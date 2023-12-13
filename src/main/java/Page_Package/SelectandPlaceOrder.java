package Page_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class SelectandPlaceOrder {

	WebDriver driver;
	loginPage loginpage;
	RegisterPage regPage;
	
	@BeforeTest
	public void startBrowser()
	{
		
	//	driver = baseClass.BrowserSetup();
		loginpage = new loginPage(driver);
		regPage=  new RegisterPage(driver);

	}
	
	 public SelectandPlaceOrder(WebDriver driver) {
		 
		 this.driver=driver;
	 }
	 public void selectNoteBook() {
		 WebElement computer = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(computer).perform();
			
			WebElement notebook = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));
			notebook.click();
			
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,700)");
			  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[5]/div/div[2]/div[3]/div[2]/button[1]")).click();
			//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[6]/div/div[2]/div[3]/div[2]/button[1]")).click();
			
	 }
	 
	 public void selectComputers()  {
		 
		 WebElement computer = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(computer).perform();
		//Thread.sleep(2000);
		WebElement compMenu = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]"));
		compMenu.click();
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,700)");
		  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
		//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();

	 }
	 public void SelectElectronics()  {
		 
		 WebElement electronics = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]"));
		Actions action = new Actions(driver);

			action.moveToElement(electronics).perform();
			
			WebElement electMenu = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]"));
			electMenu.click();
			
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,700)");
			  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
			  js.executeScript("window.scrollBy(0,1000)");
			  
			  
			  //Enter Quantity
			 WebElement Quantity= driver.findElement(By.id("product_enteredQuantity_14"));
			 Quantity.clear();
			 Quantity.sendKeys("2");
			  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-14\"]")).click();
			  
			
	 }
	 
	 public void SelectJewelry() {
	
		 
		 WebElement jewelry = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]"));
		 jewelry.click();
//		Actions action = new Actions(driver);
//			action.moveToElement(jewelry).perform();
//	
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,700)");
			  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
			//  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();

	 }
	 public void ViewCart() {
		 
		 WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
		 viewcart.click();
		 
	 }
	 public void UpdateCart() {
		 
		 WebElement updateq= driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[1]/td[5]"));
		// updateq.click();
		 updateq.click();
		 
		 updateq.sendKeys(Keys.CLEAR);
		 updateq.sendKeys(Keys.BACK_SPACE);
		 updateq.sendKeys("4");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 
		 WebElement updatebtn = driver.findElement(By.xpath("//*[@id=\"updatecart\"]"));
		 updatebtn.click();
		 
		 
	 }
	 
	 public void checkOut() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
          WebElement terms = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
       	 terms.click();
		 
		 WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		 checkout.click();
		 
	 }
	 public void login() {
		 loginpage.loginPageScenairo("fatemahmalick@gmail.com", "1234@Fatima");
		 
	 }
	 
	 public void CheckOutAgain() {
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
          WebElement terms = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
       	 terms.click();
		 
		 WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		 checkout.click();
		 
	 }
	 public void AddCheckOutDetails() {
		 
//		 WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]"));
//		 Firstname.sendKeys("Fatima");
//		 WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]"));
//		 Lastname.sendKeys("Tuz Zahra");
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,1000)"); 
//		 WebElement Email = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]"));
//		 Email.sendKeys("fatemahmalick@gmail.com");
		//Select a value from drop down
			WebElement dropdowncountry=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]"));
			Select Sel=new Select(dropdowncountry);
			Sel.selectByIndex(150);

			 WebElement City = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
			 City.sendKeys("Rawalpindi");
		 

			 WebElement Address = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
			 Address.sendKeys("NHS-1");
			 
			 WebElement postcode = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]"));
			 postcode.sendKeys("PK-123");
			 
			 WebElement phone = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]"));
			 phone.sendKeys("03060551423");
			 
			 WebElement Conbtn = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
			 Conbtn.click();
			 
			 WebElement Con = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
			 
			 Con.click();
			 
			 WebElement payment = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button"));
			 
			 payment.click();
			 WebElement payment1 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));
			 
			 payment1.click();
			 JavascriptExecutor js1=(JavascriptExecutor)driver;
			 js1.executeScript("window.scrollBy(0,1000)"); 
			 WebElement confirmbtn = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")); 
			 confirmbtn.click();
			 
			 WebElement continuebtn = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button")); 
			 continuebtn.click();
			 
			 
	 }
}

