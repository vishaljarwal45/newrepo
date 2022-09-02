package findelements_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderdlinks_study {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		      driver.get("https://www.google.com/");
		      
		      driver.findElement(By.name("q")).sendKeys(" Royal enfield 650 cc");
		      
		      Thread.sleep(1000);
              
		      List<WebElement> links = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		      Thread.sleep(1000);

		      
		  System.out.println(links.size());
		  
		  for(WebElement l:links) {
			  System.out.println(l.getText());
			  
		  }
		  
//		  for(WebElement a:links) {
//			  System.out.println(a.getText());
//		  }
//		  
          

		for(WebElement a:links) {
			
			String expectedresult="Royal enfield 650 cc";
			String actualText=a.getText();
			
			if(actualText.equals(expectedresult)) {
				a.click();
				break;
				
			}
	          driver.findElement(By.name("btnK")).click();

			driver.findElement(By.linkText("Images")).click();
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
