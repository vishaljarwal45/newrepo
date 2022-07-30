package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRCiframe {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.tagName("input")).sendKeys("welcome");
		  
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("frame2");
		
		 WebElement click = driver.findElement(By.id("animals"));
		
		
		Select s=new Select(click);
		
		s.selectByIndex(3);
		
		
		
		
		
		
	}

}
