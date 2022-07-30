package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.mumbaiindians.com/");
		
	     driver.manage().window().maximize();
	     Thread.sleep(200);
	     
	System.out.println(driver.manage().window().getSize());
		 
		 Dimension dim=new Dimension(100, 600);
		 driver.manage().window().setSize(dim);
		
	}

}
