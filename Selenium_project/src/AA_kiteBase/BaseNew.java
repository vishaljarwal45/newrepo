package AA_kiteBase;

import java.io.File; 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import AA_kiteUtility.UtilityNew;

public class BaseNew {

	public static WebDriver driver;
	
	public void OpenApplication() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get(UtilityNew.getdatafromPropertiesFile("URL"));
		
	}
		public static void screenshotmethod(ITestResult result) throws IOException {
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\selenium files\\Screenshot\\"+result.getName()+".png");
		
		FileHandler.copy(src, dest);
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

