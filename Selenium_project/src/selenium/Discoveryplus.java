package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Discoveryplus {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		
		driver.get("https://vctcpune.com/selenium/practice.html#skills");
		WebElement displaytext = driver.findElement(By.id("displayed-text"));
		
        WebElement showbutton = driver.findElement(By.id("show-textbox"));
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		
	
		hidebutton.click();
		if(displaytext.isDisplayed()) {
			
			System.out.println("textbox is displayed");
			displaytext.sendKeys("welcome");
		}
		else {
			
			System.out.println("textbox is not displayed,click on showbutton");
			showbutton.click();
			displaytext.sendKeys("welcome again");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
