package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//iframe[@id='frame1']")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
