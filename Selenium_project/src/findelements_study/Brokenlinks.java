package findelements_study;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		      driver.get("https://www.amazon.in/");
		      
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("no of links are"+links.size());
		List<String> urlList=new ArrayList<String>();
		
		for(WebElement e:links)
		{
			String url = e.getAttribute("href");
		 //    urlList.add(url);
				CheckBrokenLinks(url);

		}
		
		driver.close();
		
		
		
		
		
	}
		
	public static void CheckBrokenLinks(String linkUrl) {
		
		try {
			URL url=new URL( linkUrl);
			
			HttpURLConnection htttpConnection=(HttpURLConnection) url.openConnection();
			htttpConnection.setConnectTimeout(5000);
			htttpConnection.connect();
			
			if(htttpConnection.getResponseCode()>=400) {
				System.out.println(linkUrl+""+htttpConnection.getResponseMessage()+"is broken  link");
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
		
		
	}


