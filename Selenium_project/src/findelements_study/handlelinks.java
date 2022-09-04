package findelements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlelinks {

	public static void main(String[] args) {


		
System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		      driver.get("https://www.amazon.in/");
		      
		      
		//      driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("pay")).click();
		
		// how to capture all the links in webpage
		      
		 List<WebElement> links = driver.findElements(By.tagName("a"));     
		      
		System.out.println("number of links"+links.size());
		
		
	for(WebElement a:links)	{
		
		System.out.println(a.getText());
		System.out.println(a.getAttribute("href"));
		
		
	}
		
		
		
	}

}
