package actions_classSTudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDdrop {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	  Actions act=new Actions(driver);
	  
	 WebElement source1= driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	 WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	 WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	 WebElement dest2 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		
		
		act.clickAndHold(source2).moveToElement(dest2).release().build().perform();
	    act.clickAndHold(source1).moveToElement(dest1).release().build().perform();
		
		
		act.dragAndDrop(source2, dest2).perform();
		
		
		
		
		
		
		
		
		
	}

}
