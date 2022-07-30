package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZerodhaTestNG {
  @Test
  public void kitelaunch() {

	  System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
	 		 WebDriver driver=new ChromeDriver();
	 		
	 		driver.get("https://kite.zerodha.com/#loggedout");
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  }
	  
	  @Test
	  
	  public void paytm() {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
	 		 WebDriver driver=new ChromeDriver();
	 		
	 		driver.get("https://paytm.com/");
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

