package policyBazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class HomePage {

	
	@FindBy(xpath = "(//div[@class='shadowHandlerBox'])[1]") WebElement TermLife;
	
	@FindBy(id = "gender_male") WebElement maleCheckBox;
	
	@FindBy(id = "nameAdd") WebElement name;
	
	@FindBy(id = "dob") WebElement DOB;
	
	@FindBy(id = "mobileNo") WebElement MobileNo;
	
	@FindBy(xpath = "//span[text()='View Free Quotes ']")WebElement SubmitButton;

	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void OpenTermLife() {
		
		TermLife.click();
	}

	
	public void selectGender() {
		System.out.println(maleCheckBox.isSelected());
		maleCheckBox.click();
	}
	
	public void addName(String myname) {
		name.sendKeys(myname);
	}
	public void AddDOB(String myDOB) {
		DOB.sendKeys(myDOB);
	}

	public void addMobilNum(String mobNum) {
		
		MobileNo.sendKeys(mobNum);
	}
	public void SubmitButton() {
		SubmitButton.click();
	}
	
}
