package dynamic_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		    
		String year="2022";
		String month="dec";
		String date="10";
		
		
		driver.findElement(By.xpath("//span[contains(@class,'fl icon-calendar_')]")).click();
		
		while(true) {
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[]= monthyear.split(" ");
	
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year)){
				break;
			}
			else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			
			List<WebElement> dates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
			
			for(WebElement l:dates) {
				String dt = l.getText();
				if(dt.equals(date));
				break;
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
