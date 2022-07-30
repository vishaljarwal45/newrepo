package TestNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelExecution {
	 @Test
	  public void Groww() {
		  

			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
			
			 WebDriver driver=new ChromeDriver();
			driver.get("https://groww.in/");
			
}}
