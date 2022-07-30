package TestNGgrowW;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GrowwTestClass {
	
	WebDriver driver;
	File MyFile;
	org.apache.poi.ss.usermodel.Sheet MySheet;
	GrowwLogin login;
	GrowwHomePage home;
	
	@BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		MyFile=new File("D:\\velocity\\excelfile.xlsx");
		MySheet=WorkbookFactory.create(MyFile).getSheet("Groww");
		
		login=new GrowwLogin(driver);
		home=new GrowwHomePage(driver);
	}
	
 @BeforeMethod
 
 public void GrowwLogin() {
	 login.ClickOnLoginpage();
	 Reporter.log("clicking on login page started ",true);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	 
	 login.Emailinput(MySheet.getRow(0).getCell(0).getStringCellValue());
	 
	 login.ClickOnContinue();
	 Reporter.log("clicking on continue ",true);
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));


	 
	 login.PassInput(MySheet.getRow(0).getCell(1).getStringCellValue());
	 login.ClickToLogin();
	 Reporter.log("password entered ",true);

	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	 
	 
	 login.pinpage(MySheet.getRow(0).getCell(2).getStringCellValue());
	 Reporter.log("pin entered ",true);

	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
 }
	 @Test
	 public void validateUserId() {
		String expecteduserid = MySheet.getRow(0).getCell(0).getStringCellValue();
		     String  actualuserid=home.GetActualUserID();
		 
		  Assert.assertEquals(actualuserid, expecteduserid,"failed TC") ;
		  
		     
	 }
	 
	 
	 
 }
 
		
		
		
		
		
		
	
	
	
  
	

