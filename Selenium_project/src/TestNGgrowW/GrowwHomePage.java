package TestNGgrowW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwHomePage {

	
	@FindBy (xpath = "(//div[@class='dropdown__trigger '])[1]") private WebElement ClickOnUser;
	
	
	@FindBy(xpath = "(//div[@class='settingItem valign-wrapper'])[5]") private WebElement logOut;
	
	
	public  GrowwHomePage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickOnuserIcon() {
		
		ClickOnUser.click();
	}
	
	public void logOutClick() {
		
		logOut.click();
	}
}
