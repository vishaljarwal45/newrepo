package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook air");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
//		Thread.sleep(200);
//		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
//		
//		
//		int links=driver.findElements(By.tagName("a")).size();
//		
//		System.out.println(links);
		
	//int allele=driver.findElements(By.className("a-carousel-card")).size();
		
		//System.out.println(allele);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
