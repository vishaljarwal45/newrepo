package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_drop {

	public static void main(String[] args) throws InterruptedException {
 
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe")	;
	
	WebDriver driver=new ChromeDriver();
	
		  driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 
		WebElement animals = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select s=new Select(animals);
		System.out.println(s.isMultiple());
		
//		s.selectByIndex(1);
//		s.selectByValue("bonda");
//		s.selectByVisibleText("Burger");
//		
//		
//		Thread.sleep(300);
//	//	s.deselectAll();
//		s.deselectByVisibleText("Burger");
//		
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		
		
		for(WebElement l:alloptions) {
			System.out.println(l.getText());
			if(l.getText().equals("Burger")) {
				l.click();
				break;
			}
		}
		
		
		
		
		
		
	}

}
