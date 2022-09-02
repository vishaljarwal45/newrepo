package actions_classSTudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions2 {

	public static void main(String[] args) throws InterruptedException {



System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/key_presses"); 
	
	   Actions act=new Actions(driver);
	      act.sendKeys(Keys.ENTER).perform();
	
	}
 
}
