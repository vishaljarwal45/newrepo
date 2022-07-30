package selenium_wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_inselenium {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {



		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		File myfile=new File("D:\\velocity\\excelfile.xlsx");
			
    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Groww");
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		
		driver.findElement(By.id("login_email1")).sendKeys(mysheet.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
