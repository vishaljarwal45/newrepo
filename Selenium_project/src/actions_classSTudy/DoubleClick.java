package actions_classSTudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();		
		
		driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(500);
		driver.findElement(By.linkText("Insurance Project")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		driver.switchTo().newWindow(WindowType.TAB);

		
		
		
		Actions act=new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		// act.moveToElement(button).doubleClick().build().perform();
		act.doubleClick(button).perform();
		
		System.out.println(button.getSize());
		System.out.println(button.getLocation());
		System.out.println(button.getRect());
		
		
		
		
		
		
		
	}

}
