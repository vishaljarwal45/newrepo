package AA_testNGkitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KiteHomePage {

	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement HUID;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement Logout;
	
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	public String homeUserID() throws InterruptedException {

		String actualUID=HUID.getText();
		return actualUID;
	}

		public void logoutbutton() throws InterruptedException {
			HUID.click();
			Thread.sleep(500);

			Logout.click();

		} 
			
		
		
		
}
