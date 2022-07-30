package selenium_wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.webdriver_methods;

public class Explicit_wait {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		
		
		File myfile=new File("D:\\velocity\\excelfile.xlsx");
			
    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Groww");
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();

		 WebElement email = driver.findElement(By.xpath("//span[text()='Login/Register']"));
		  String login = mysheet.getRow(0).getCell(0).getStringCellValue();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(2000));
		System.out.println(w.until(ExpectedConditions.visibilityOf(email)));
		
		
		
		
		
		
	}

}
