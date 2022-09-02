package dynamic_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prcDynamicElement {

	public static void main(String[] args) {


		

		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cricket teams");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul//div//li"));
		
		// List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role]//div/span"));
		
	System.out.println(list.size());
	for(WebElement l:list) {
		System.out.println(l.getText());
		
	}
		
		
		
		
	}

}
