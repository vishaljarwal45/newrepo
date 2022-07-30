package setSizeSetPosition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Study {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     driver.manage().window().maximize();
	     Thread.sleep(200);
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     
		js.executeScript("window.scrollBy(0,1000)");
	     Thread.sleep(200);

	     js.executeScript("window.scrollBy(0,-400)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
