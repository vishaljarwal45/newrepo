package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Drop_down3 {

	public static void main(String[] args) throws InterruptedException {
	    ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--disable-notifications");

    System.setProperty("webdriver.chrome.driver","C:\\selenium files\\lib\\chromedriver.exe");
    
         WebDriver driver =new ChromeDriver(opt);

         
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(200);

		driver.findElement(By.xpath("//div[@class='dropdown']")).click();

		 List<WebElement> drop = driver.findElements(By.xpath("//div[@class='dropdown open']//ul//li"));
	     System.out.println(drop.size());
	     
	     for(WebElement l:drop) {
	    	 if(l.getText().equals("EMI")) {
	    		 l.click();
	    		 break;
	    	 }
	     }
	     
	     
	     
	     
		}
}
		
		
		
		
		
	


