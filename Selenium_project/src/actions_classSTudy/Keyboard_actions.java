package actions_classSTudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException {



System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();	
		
		
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Actions act=new Actions(driver);
	Thread.sleep(2000);

	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		act.click(day).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_UP).perform();
		act.click();
		for(int i=0;i<=5;i++) {
			act.sendKeys(Keys.DOWN).perform();
			
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
 
}
