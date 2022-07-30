package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods {

	public static void main(String[] args) throws InterruptedException {

		
		
        System.setProperty("webdriver.chrome.driver","C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.geeksforgeeks.org/");
		
     //  driver.close();
		
	 //	driver.quit();
		
		driver.manage().window().maximize();
		
	

		driver.navigate().to("https://uidai.gov.in/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		
	         String title = driver.getTitle();
	         System.out.println(title);
		
		    String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		
		
		
	}

}
