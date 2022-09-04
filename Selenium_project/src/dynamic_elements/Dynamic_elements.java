package dynamic_elements;

import java.time.Duration;
import java.util.List;

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
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();

		System.out.println(rows);
		int column=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr")).size();
    System.out.println(column);
    
//    String data1 = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr[2]/td[1]")).getText();
//    
//    System.out.println(data1);
    
    
    for(int r=1;r>=0;r++) {
    	for(int c=1;c>=0;c++) {
    		
    		String data1 = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+r+"]/td["+c+"]")).getText();
    	    
    	    System.out.println(data1);
    	}
    	
    	System.out.println();
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
