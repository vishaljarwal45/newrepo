package TestNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	
	
	
	@Parameters("BrowserName")

  @Test

  public void test(String BrowserName) {
		WebDriver driver = null;
		
		if(BrowserName.equals("chrome")){

	 System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
	  
	   driver=new ChromeDriver();
	  
	 
	  driver.manage().window().maximize();}
  
		else if(BrowserName.equals("firefox"))
  
 {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\lib\\geckodriver.exe");
	  
	  driver=new FirefoxDriver();
  }

		else if(BrowserName.equals("Edge"))
  
 {
	  
	  System.setProperty("webdriver.edge.driver", "C:\\selenium files\\lib\\msedgedriver.exe");
	  
	  driver=new EdgeDriver();
  }
		
	  driver.get("https://groww.in/");  
	  driver.manage().window().maximize();
	  
	}
  
	
	
  
  
}
