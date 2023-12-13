package Page_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	WebDriver driver;
	
	public static String url = "https://demo.nopcommerce.com/";
	
	public static WebDriver BrowserSetup() {
		
		WebDriverManager.chromedriver().setup();
		// Headless browser 
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
	//	WebDriver driver=new ChromeDriver(options);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
