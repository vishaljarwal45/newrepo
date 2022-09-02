package policyBazzar;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener; 
import org.testng.ITestResult;
import org.testng.Reporter;




public class Listener extends Base implements ITestListener{

		
		public void onStart(ITestResult result) {
			Reporter.log("when TC started "+result.getName(),true);
			}
		
		
		public void onTestStart(ITestResult result) {
			
			Reporter.log("On test case started "+result.getName(),true);
		}
		
		
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Test case has been skipped"+result.getName(),true);
		}
		
		public void onTestSuccess(ITestResult result) {
			Reporter.log("test cases successfully passed "+result.getName(),true);
		}
		
		
		public void  onFinish(ITestResult result) {
			Reporter.log("on test case finish"+result.getName(),true);
		}
		
		public void onTestFailure(ITestResult result) {
			Reporter.log("on test case failure"+result.getName(),true);
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
			
		}
		
		
		
		
}
