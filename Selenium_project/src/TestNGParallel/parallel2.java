package TestNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 {
	 @Test
	  public void Paytm() {
		  

			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
			
			 WebDriver driver=new ChromeDriver();
			driver.get("https://paytm.com/");
}}
