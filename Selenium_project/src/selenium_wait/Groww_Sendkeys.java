package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Groww_Sendkeys {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	WebElement InsertValue = driver.findElement(By.id("globalSearch23"));
	   
	InsertValue.sendKeys("tata power");                                         //normal
	
	Thread.sleep(1000);
	InsertValue.clear();
			
	JavascriptExecutor js = (JavascriptExecutor)driver;
		                                                                            //jsexecutor
//		js.executeScript("arguments[0].scrollIntoView();",InsertValue);
		
	   js.executeScript("arguments[0].value='realiance'",InsertValue);
		
	   Thread.sleep(1000);
		
				                                                               //actions
		Actions act=new Actions(driver);
		Thread.sleep(500);
		InsertValue.clear();
		
		act.sendKeys(InsertValue, "infosys").perform();
	
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		
		
		
		
		
		
		
		
	}

}
