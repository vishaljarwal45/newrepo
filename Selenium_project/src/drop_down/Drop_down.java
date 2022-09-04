package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:\\selenium files\\lib\\chromedriver.exe");
    
         WebDriver driver =new ChromeDriver();
         
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);

	    
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("vishal");
		driver.findElement(By.name("lastname")).sendKeys("jarwal");
		
		
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
       Select v=new Select(day);
		v.selectByVisibleText("22");
		Thread.sleep(200);
		
         WebElement month = driver.findElement(By.id("month"));
		Select v1=new Select(month);
		v1.selectByVisibleText("Jan");  
		Thread.sleep(200);

		WebElement year = driver.findElement(By.id("year"));
		Select v2=new Select(year);
		v2.selectByVisibleText("1997");
		
		for(int i=1;i<=20;i++) {
			
			v2.selectByIndex(i);
		}
		
		Thread.sleep(500);
     for(int i=30;i>=1;i--) {
    	 v2.selectByIndex(i);
     }
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
		
		
		
		
	}


