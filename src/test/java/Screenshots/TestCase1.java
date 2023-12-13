package Screenshots;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Screenshots.ListenerClass.class)
public class TestCase1 extends baseClass{
	
	
	@BeforeTest
	public void setup() {
		BrowserSetup();
	}
	
  @Test
  public void testMethod() {
	  
	  driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/b"));
  }
 
  
  
  
}
