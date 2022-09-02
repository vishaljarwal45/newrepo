package AA_testNGkitePOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestNGgrowW.GrowwHomePage;
import TestNGgrowW.GrowwLogin;

public class kiteTestclassTestNG {
  
	
	WebDriver driver;
	File MyFile;
	org.apache.poi.ss.usermodel.Sheet MySheet;
	Loginpage login;
	KiteHomePage home;
	KitePinPage pin;
	
	@BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		 Reporter.log("open kite url ",true);

		MyFile=new File("D:\\velocity\\excelfile.xlsx");
		MySheet=WorkbookFactory.create(MyFile).getSheet("Sheet4");
		
		
		login=new Loginpage(driver);
		home=new KiteHomePage(driver);
		pin=new KitePinPage(driver);
		
	}
	
 @BeforeMethod
 
 public void KiteLogin() {
	
	 login.SendUserID(MySheet.getRow(0).getCell(0).getStringCellValue());
	 
	
	 Reporter.log("User id entered",true);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	 login.SendPass(MySheet.getRow(0).getCell(1).getStringCellValue());
	 login.ContinueButton();
	 Reporter.log("password entered ",true);

	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	 
	 pin.enterpin(MySheet.getRow(0).getCell(2).getStringCellValue());
	 Reporter.log("pin entered ",true);

	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 pin.ClickOnContinue();
	 Reporter.log("all clear clicked on continue button ",true);

 }
	 @Test
	 public void validateUserId() throws InterruptedException {
		String expecteduserid = MySheet.getRow(0).getCell(0).getStringCellValue();
		     String  actualuserid=home.homeUserID();
		 
		  Assert.assertEquals(actualuserid, expecteduserid,"failed TC") ;
		  
		Reporter.log("validated actual and expected userID test case pass",true);
	 }
	 
	 @AfterMethod
	 
	 public void logoutkite() throws InterruptedException {
		home.logoutbutton();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			Reporter.log("logout kite successfully",true);
		 
	 }
	 @AfterClass
	 
	 public void closebrowser() {
		 
		 driver.close();
		 Reporter.log("browser closed successfully",true);
	 }
	
	
	
	
}
