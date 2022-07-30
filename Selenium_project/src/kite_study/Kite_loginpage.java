package kite_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_loginpage {

	//declaration
	
    @FindBy(id = "userid") private WebElement UserID;
	
	@FindBy(id="password") private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement  loginbutton;
	
	// initialization
	
	public Kite_loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void SendUserId() {
		UserID.sendKeys("ElR321");
	}
	
	public void SendPassword() {
		Password.sendKeys("Dhana1111");
	}
	public void ClickOnLogin() {
		
		loginbutton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
