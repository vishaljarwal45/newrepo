package actions_classSTudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();		
		
		driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		 act.moveToElement(button).doubleClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
