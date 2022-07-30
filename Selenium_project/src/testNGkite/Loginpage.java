package testNGkite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	
	
	//1
	
	@FindBy(id = "userid") private WebElement UserID;
	
	@FindBy(id = "password") private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement Continue;
	
	
	//2 
	
	public Loginpage (WebDriver driver) {    
		 
		PageFactory.initElements(driver, this);
	}
	
	//3
	
	public void SendUserID(String userid) {
		UserID.sendKeys(userid);
		
	}
	
	
	public void SendPass(String Pass) {
		
		Password.sendKeys(Pass);
	}
	
	
	public void ContinueButton() {
		Continue.click();
	}
	
	
	
	
}
