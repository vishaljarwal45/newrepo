package TestNGgrowW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwHomePage {

	
	@FindBy (xpath = "(//div[@class='dropdown__trigger '])[1]") private WebElement ClickOnUser;
	
	
	@FindBy(xpath = "(//div[@class='settingItem valign-wrapper'])[5]") private WebElement logOut;
	
	@FindBy(xpath = "//p[@class='truncate headerDggnd']") private WebElement Userid;
	
	public  GrowwHomePage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickOnuserIcon() {
		
		ClickOnUser.click();
	}
	
	public String GetActualUserID() {
		
		String ActualUserID = Userid.getText();
	  return ActualUserID;
		
	}
	
	
	public void logOutClick() {
		
		logOut.click();
	}
}
