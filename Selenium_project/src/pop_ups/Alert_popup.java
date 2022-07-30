package pop_ups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Alert_popup {

	public static void main(String[] args) throws IOException, InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		
		alert.accept();
		
		driver.findElement(By.className("header-text")).click();
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(3);
		

      File dest=new File("C:\\selenium files\\Screenshot\\"+random+"snapalert.png");
		
		
  org.openqa.selenium.io.FileHandler.copy(src, dest);
		
  
  
  
	}

}
