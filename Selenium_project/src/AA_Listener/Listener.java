package AA_Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import AA_kiteBase.BaseNew;
import AA_kiteUtility.UtilityNew;

public class Listener extends BaseNew implements ITestListener {

	public void onStart(ITestResult result) {
		Reporter.log("onStart "+result.getName(),true);
	}

	public void onTestStart(ITestResult result) {
		
		Reporter.log("test case execution started "+result.getName(), true);
	}
	
	
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("TC has been skipped "+result.getName(),true);
	}
	
	
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("TC has been failed "+result.getName(),true);
		try {
			screenshotmethod(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TC has been passed "+result.getName(),true);
	}
	
	
	
	
}
	
	
	
	
	

