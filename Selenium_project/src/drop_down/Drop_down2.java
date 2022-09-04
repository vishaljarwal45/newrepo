package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down2 {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:\\selenium files\\lib\\chromedriver.exe");
    
         WebDriver driver =new ChromeDriver();
         
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);

	    
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(200);
		
		driver.findElement(By.name("firstname")).sendKeys("vishal");
		driver.findElement(By.name("lastname")).sendKeys("jarwal");
		
		
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 selectdropdown(day, 22);
         WebElement month = driver.findElement(By.id("month"));
         selectdropdown(month,1);
     	WebElement year = driver.findElement(By.id("year"));
         selectdropdown(year, 1997);
	}
	       
		
		public static void  selectdropdown(WebElement ele,int value) {
			
			   Select s=new Select(ele);
			   
			   List<WebElement> alloption = s.getOptions();
			
			for(WebElement l:alloption) {
				if(l.getText().equals(value)) {
					l.click();
					break;
				}
				    
			}
			
			
			
		}
		
		
		
		
		
			
		}
		
		
		
		
		
		
	


