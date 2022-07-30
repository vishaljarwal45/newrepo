package pomWithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
      ChromeOptions opt=new ChromeOptions();
      opt.addArguments("--headless");
      
      
		WebDriver driver =new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		
		File myfile=new File("D:\\velocity\\excelfile.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.SendUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.SendPass(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.ContinueButton();
		
		Thread.sleep(1000);
		
		KitePinPage pin=new KitePinPage(driver);
		pin.enterpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.ClickOnContinue();
		
		Thread.sleep(1000);
		
		KiteHomePage home=new KiteHomePage(driver);
		home.homeUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
	
		home.logoutbutton();
		
		
		
		
		
		
		
	}

}
