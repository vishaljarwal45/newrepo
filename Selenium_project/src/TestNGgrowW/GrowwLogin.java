package TestNGgrowW;
import org.apache.poi.ss.usermodel.Cell; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class GrowwLogin {

//	@FindBy(xpath = "//button[@type='submit']") private WebElement Continue;
	

	@FindBy(xpath="//span[text()='Login/Register']") private  WebElement ClickOnUser;
	
	@FindBy(id="login_email1") private WebElement email;
	
	@FindBy(xpath="//span[text()='Continue']") private WebElement ContinueButton;
	
	@FindBy(id="login_password1") private WebElement Password;
	
	@FindBy(xpath="//span[text()='Submit']") private WebElement Continubutton;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div[1]/div[2]/div/div/div") private WebElement PinPage;
	
	public  GrowwLogin(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
		
	}
	
	public void ClickOnLoginpage() {
		
		ClickOnUser.click();
	}
	
	public void Emailinput(String EmailInput) {
		
		email.sendKeys(EmailInput);
	}
		
  public void  ClickOnContinue() {
	  
	  ContinueButton.click();
  }
   
  public void PassInput(String Pass) {
	  
	  Password.sendKeys(Pass);
	  
  }
  public void ClickToLogin() {
	  
	  Continubutton.click();
  }
		
  public void pinpage(String pinpage) {
	  
	  PinPage.sendKeys(pinpage);
  }

	}


