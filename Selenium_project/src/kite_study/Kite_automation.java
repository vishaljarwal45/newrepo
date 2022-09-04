package kite_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_automation {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		File excelfile= new File("D:\\velocity\\excelfile.xlsx");

	   
		Sheet mysheet = WorkbookFactory.create(excelfile).getSheet("Sheet4");
                  
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		
		
		
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.id("userid"));
		
		WebElement pass = driver.findElement(By.id("password"));
		
 WebElement clickbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.sendKeys(mysheet.getRow(0).getCell(0).getStringCellValue());
		pass.sendKeys(mysheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);

		clickbutton.click();
		Thread.sleep(1000);

		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(mysheet.getRow(0).getCell(2).getStringCellValue()); 
		   
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		
		WebElement Uid = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String ExpectedUserId = "ELR321";
		       String ActualUserId = Uid.getText();
		
		
		if(ExpectedUserId.equals(ActualUserId)) {
			
			System.out.println("actual and expected userID is mached hence test pass");
		}
		else {
			System.out.println("test fails");
		}
		Uid.click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
         driver.close();
		
	}

}
