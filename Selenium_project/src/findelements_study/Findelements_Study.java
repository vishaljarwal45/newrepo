package findelements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements_Study {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://vctcpune.com/");
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		  for(WebElement l:links)
		  {
			  System.out.println(l.getText());
		  }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
