package AA_KiteTestClass;

import java.io.IOException; 

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AA_kiteBase.BaseNew;
import AA_kiteUtility.Utility;
import AA_kiteUtility.UtilityNew;
import AA_testNGkitePOM.KiteHomePage;
import AA_testNGkitePOM.KitePinPage;
import AA_testNGkitePOM.Loginpage;

@Listeners(AA_Listener.Listener.class)

public class NewTestKite extends BaseNew {
	
	Loginpage login; 
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void launchBrowser() throws IOException {
		OpenApplication();
		UtilityNew.waitTime(driver);
		
		login=new Loginpage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void LoginApplication() throws IOException {
		
		login.SendUserID(UtilityNew.getdatafromPropertiesFile("UN"));
		login.SendPass(UtilityNew.getdatafromPropertiesFile("PWD"));
		login.ContinueButton();
		
		 UtilityNew.waitTime(driver);
		 
		 pin.enterpin(UtilityNew.getdatafromPropertiesFile("PIN"));
		 pin.ClickOnContinue();
		
	}
	
	@Test
	public void validateUserID() throws InterruptedException, IOException {
		int TCID=12;
		
		Assert.assertEquals(home.homeUserID(), UtilityNew.getdatafromPropertiesFile("UN1"));
	//	Utility.captureSceenshot(driver, TCID);
		UtilityNew.waitTime(driver);
		
	}
	@AfterMethod
	public void closeApplication() throws InterruptedException {
		
		home.logoutbutton();
		
	}
	@AfterClass
	
	public void closebrowser() {
		driver.close();
	}
	
	
}
