package AA_KiteTestClass;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import AA_kiteBase.Base;
import AA_kiteUtility.Utility;
import AA_testNGkitePOM.KiteHomePage;
import AA_testNGkitePOM.KitePinPage;
import AA_testNGkitePOM.Loginpage;

public class kiteTest  extends Base{
	
	Loginpage login;
	KitePinPage  pin;
	KiteHomePage home;
	
	
	@BeforeClass 
	public void launchBrowser()  throws InterruptedException {
		
		openApplication("browsername");
		Reporter.log("application has opened",true);
		
		Utility.implicityWaitMethod(driver);
		login=new Loginpage(driver);
		pin=new KitePinPage(driver);
	    home=new KiteHomePage(driver);
	    
		
		
	}
	
	@BeforeMethod
	public void LoginToKite() throws EncryptedDocumentException, IOException {
	  login.SendUserID(Utility.getDataFromExcel(0, 0));
	  login.SendPass(Utility.getDataFromExcel(0, 1));
	  login.ContinueButton();
		
	  Utility.implicityWaitMethod(driver);
	  
	  pin.enterpin(Utility.getDataFromExcel(0, 2));
	  pin.ClickOnContinue();
	  
	  Utility.implicityWaitMethod(driver);
		Reporter.log("data entered",true);

	}
	
  @Test
  public void validateUserID() throws EncryptedDocumentException, InterruptedException, IOException {
	  
	  int TCID = 1234;
	  Assert.assertEquals(home.homeUserID(),Utility.getDataFromExcel(0, 0),"test case failed");
	  
	  Utility.captureSceenshot(driver, TCID);
		Reporter.log("test case validated",true);

  }
  @AfterMethod
  public void logoutkite() throws InterruptedException {
	  
	   home.logoutbutton();
		Reporter.log(" application logout",true);

  }
  @ AfterClass
  
  public void closeBrowser() {
	  
	  driver.close();
		Reporter.log("Browser has been closed",true);

  }
}
