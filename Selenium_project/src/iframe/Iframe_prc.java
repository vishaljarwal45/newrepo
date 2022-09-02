package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe_prc {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
	  driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        
        
        
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("welcome vishal practice well");
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");
		WebElement select = driver.findElement(By.id("animals"));
		
		
		Select s=new Select(select);
		s.selectByIndex(3);
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest=new File("C:\\selenium files\\Screenshot\\snap.png");
		 
		 FileHandler.copy(src, dest);
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 
		 
		
		
		
		
		
	}

}
