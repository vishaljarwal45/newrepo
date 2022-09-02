package findelements_study;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks2 {

	public static void main(String[] args) throws MalformedURLException {

	System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		      driver.get("https://www.amazon.in/");
		      
	
		List<WebElement> links=driver.findElements(By.tagName("a"));	
		int brokenlinks=0;
		
		for(WebElement element:links) {
			
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty() ) {
				System.out.println("URL is empty");
				continue;
			}
			 URL link=new URL(url);
			try {
				HttpURLConnection http=(HttpURLConnection)link.openConnection();
				http.connect();
				if(http.getResponseCode()>=400) {
					System.out.println("broken link");
					brokenlinks++;
				}
				else {
					System.out.println("is valid link");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println(brokenlinks);
			
			
			
		}
			
			
			
			
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
		
		
	}


