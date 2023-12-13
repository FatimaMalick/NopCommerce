package Screenshots;

import java.io.File;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	
	public  WebDriver driver;
	
public static String url = "https://demo.nopcommerce.com/";
	
	public static WebDriver BrowserSetup() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	public void CaptureScreenshot(String methodname) {
		
		try {
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\abc.jpg"));
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
	
}
