package actions_classSTudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_classStudy {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		  WebElement home = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		
		
		 act.moveToElement(home).click().perform();
		
	//	 act.click(home).perform();
		 
		 WebElement radio1 = driver.findElement(By.name("radio"));
		
		
	//	act.moveToElement(radio1).click().build().perform();
		
		act.click(radio1).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
