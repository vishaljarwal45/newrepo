package kite_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page {

	
	@FindBy(id="pin") private WebElement pin;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	
	
	public Pin_page (WebDriver driver) {
		
		PageFactory.initElements( driver , this);
	}
	
	public void sendpin(){
		pin.sendKeys("982278");
	}
	public void submitButton() {
		submit.click();
	}
	
}
