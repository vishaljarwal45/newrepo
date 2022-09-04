package policyBazzar;

import java.io.IOException; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base {

	public static WebDriver driver;
	
	public  void initializebrowser() throws IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
//		driver=new ChromeDriver();
//		 
//		
//		driver.get(Utility.GetDataFromPropertiesfiles("URL"));
			
	
		System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\lib\\geckodriver.exe");
		driver=new FirefoxDriver();
		 
		
		driver.get(Utility.GetDataFromPropertiesfiles("URL"));
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
