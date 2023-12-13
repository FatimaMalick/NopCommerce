package Screenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerClass extends baseClass implements ITestListener {
  @Test
  public void onTestFailure(ITestResult result) {
	  
	  System.out.println("Test is Failed");
	  try {
		  CaptureScreenshot(result.getName());
		  
		  
	  }
	  catch(Exception e) {
		  e.getMessage();
	  }
  
	  
  }
}
