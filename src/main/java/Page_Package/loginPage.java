package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

public void preCondition() {
	WebElement login = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	login.click();
}

	public void loginPageScenairo(String email , String pass) {
		

		
		WebElement emailaddress = driver.findElement(By.id("Email"));
		emailaddress.sendKeys(email);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(pass);
		
		WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
		loginbtn.click();
	
	WebElement message = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
	String msg= message.getText();
	
	
//	String actualMessage = "Login was unsuccessful. Please correct the errors and try again.\n"+
//			"No customer account found" ;
//			
	String actualMsg = "Login was unsuccessful. Please correct the errors and try again.\n"
			+ "No customer account found";
		
	//logic 
	
	if (msg == actualMsg) {
		WebElement regbtn = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button"));
		regbtn.click();	
	}
	else {
		
	}
		
		System.out.print("Failed");
	}
	}
