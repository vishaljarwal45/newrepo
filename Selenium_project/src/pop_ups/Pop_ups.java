package pop_ups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pop_ups {

	public static void main(String[] args) throws IOException, InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("		//button[@class='_2KpZ6l _2doB4z']\r\n"
				)).click();
		
		Thread.sleep(500);
		
		boolean display = driver.findElement(By.name("q")).isDisplayed();
		boolean selected = driver.findElement(By.name("q")).isSelected();
		boolean enabled = driver.findElement(By.name("q")).isEnabled();

		System.out.println(display);
		System.out.println(selected);
		System.out.println(enabled);

		
		  driver.findElement(By.name("q")).sendKeys("welcome by a macboook vishal");
		
		  driver.findElement(By.name("q")).clear();
		  
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		 File dest=new File("C:\\selenium files\\Screenshot\\snap.png");
		  FileHandler.copy(src,dest);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
