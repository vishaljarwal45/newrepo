package pomWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.Webelementsmethods;

public class KiteHomePage {

	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement HUID;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement Logout;
	
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void homeUserID(String ExpectedUID) throws InterruptedException {

		String actualUID=HUID.getText();
		
		if(actualUID.equals(ExpectedUID)) {
			System.out.println("All clear test case passed");
		}
		else {
			System.out.println("test case failed");
			
		}
	}	
		public void logoutbutton() throws InterruptedException {
			HUID.click();
			Thread.sleep(500);

			Logout.click();

		} 
			
		
		
		
		
		
		
	}

	
	
	
	
	
	
	


