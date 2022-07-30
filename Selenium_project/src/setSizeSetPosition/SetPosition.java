package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.mumbaiindians.com/");
		
	     driver.manage().window().maximize();
	     Thread.sleep(200);
		
	 System.out.println( driver.manage().window().getPosition());
	 Point pt=new Point(100, 200);
		
	 driver.manage().window().setPosition(pt);
		
		
		
		
	}

}
