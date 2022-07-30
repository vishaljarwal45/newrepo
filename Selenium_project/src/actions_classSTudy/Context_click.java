package actions_classSTudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_click {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(rightclick) .contextClick(rightclick).build().perform();
		
		
		
		
		
	}

}
