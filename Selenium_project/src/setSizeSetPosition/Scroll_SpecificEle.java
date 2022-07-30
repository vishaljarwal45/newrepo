package setSizeSetPosition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_SpecificEle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.mumbaiindians.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     driver.manage().window().maximize();
	     
		
	WebElement waithere = driver.findElement(By.xpath("//span[text()='Rohit']"));
	waithere.click();
		
		     JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollInToView();,waithere");
		
		
		
	}

}
