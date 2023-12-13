package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void preCondition() {
		
		//WebElement login = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	//	login.click();
		WebElement registerbtn=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		registerbtn.click();
	}


	public void registerPageScenairo(String fname,String lname, String day,String month, String year,String email , String company,String pass, String conpass) {
		
		WebElement selectgender = driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label"));
		selectgender.click();
	//	selectgender.sendKeys(gender);
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys(fname);
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys(lname);
		
	//	WebElement dropdownday=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
	//	Select Sel=new Select(dropdownday);
	//	Sel.selectByValue("17");
		
		Select dropdownday = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")));
		dropdownday.selectByVisibleText(day);

		WebElement dropdownmon=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		Select Sel1=new Select(dropdownmon);
		Sel1.selectByValue("1");
	
		WebElement  dropdownyear= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
		Select Sel2=new Select(dropdownyear);
		Sel2.selectByValue("1913");
		
		 
      
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,1000)");
	WebElement semail = driver.findElement(By.id("Email"));
	      semail.sendKeys(email);
//		

		WebElement scompany = driver.findElement(By.id("Company"));
		scompany.sendKeys(company);
		

		WebElement spassword = driver.findElement(By.id("Password"));
		spassword.sendKeys(pass);
		

		WebElement sconpass = driver.findElement(By.id("ConfirmPassword"));
		sconpass.sendKeys(conpass);
		
		WebElement regbtn = driver.findElement(By.id("register-button"));
		regbtn.click();
		
	}
	public void postCondition() {
		
		WebElement Con=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a"));
		Con.click();
	}
}