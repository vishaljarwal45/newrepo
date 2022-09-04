package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.kalkifashion.com/checkout/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class='input-text'])[3]")).sendKeys("vishalrathod@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"customer-password\"]")).sendKeys("Pass@123");		     

		
		 WebElement country = driver.findElement(By.xpath("//*[@id=\"NNJGY8F\"]\r\n"
				+ ""));
		
		Select s=new Select(country);
		     s.selectByVisibleText("India");
		     
		     WebElement state = driver.findElement(By.xpath("//*[@id=\"A2RK4WF\"]"
						+ ""));
				
				Select s1=new Select(country);
				     s1.selectByVisibleText("Maharashtra");    
				  
			

				     
		driver.findElement(By.xpath("//*[@id=\"CXKY1WK\"]")).sendKeys("aurangabad");		     
		
		driver.findElement(By.xpath("//*[@id=\"QOP7KBI\"]")).sendKeys("431001");		     
		
		driver.findElement(By.xpath("//*[@id=\"GFH4WSQ\"]")).sendKeys("aurangabad,maharashtra");		     
		
		driver.findElement(By.xpath("//*[@id=\"KT41U14\"]")).sendKeys("vishal");		     
		
		driver.findElement(By.xpath("//*[@id=\"P8688U4\"]")).sendKeys("rathod");		     
		
		driver.findElement(By.xpath("//*[@id=\"WI8STXP\"]")).sendKeys("8456454545");	
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
	}

}
