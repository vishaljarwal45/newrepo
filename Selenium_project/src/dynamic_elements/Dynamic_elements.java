package dynamic_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_elements {

	public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("macbook air");
		
		driver.findElement(By.className("L0Z3Pu")).click();
		

		
		WebElement review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[2]//span)[8]"));
		
		System.out.println(review.getText());
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));
		w.until(ExpectedConditions.visibilityOf(review));
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
