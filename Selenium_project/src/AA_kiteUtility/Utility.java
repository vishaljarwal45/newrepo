package AA_kiteUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	

	public static String  getDataFromExcel(int RowNum,int CellNum) throws EncryptedDocumentException, IOException {
		
	File myfile=new File("D:\\velocity\\excelfile.xlsx");	
	
	
		String value = WorkbookFactory.create(myfile).getSheet("Sheet4").getRow(RowNum).getCell(CellNum).getStringCellValue();
		
		return value;
		
	}
	
	public static void captureSceenshot(WebDriver driver,int TCID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\selenium files\\Screenshot\\"+TCID+"snapshot.jpg");
		
		FileHandler.copy(src, dest);
		Reporter.log("taken screenshot",true);
	}
	
	public static void implicityWaitMethod(WebDriver driver) {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	
	
	
	
	
	
	
	
}
