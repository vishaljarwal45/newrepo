package pop_ups;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window_popup {

	public static void main(String[] args) throws InterruptedException {

 System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
 
  WebDriver driver=new ChromeDriver();
  
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
	 //to get the id of main page 
		String idofmainpage = driver.getWindowHandle();            // not mandatory
		
		System.out.println(idofmainpage);
		
		//to get multile ids
		
      Set<String> ids = driver.getWindowHandles();
		 
      System.out.println(ids);
      
      // convert set into arraylistType
      
          ArrayList<String> al=new ArrayList<String>(ids);
      
		String newidofmainpage=al.get(0);
		String idofchildpage=al.get(1);
		
		
		driver.switchTo().window(idofchildpage);
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		driver.findElement(By.id("firstName")).sendKeys("vishal is here");
		
	 driver.close();                          
		
		driver.switchTo().window(newidofmainpage);
		
		WebElement link = driver.findElement(By.xpath("(//li[@class='parent'])[6]"));
		
		Select s=new Select(link);
		
		s.selectByIndex(5);
		
		
		
		
		
		
	

}}
