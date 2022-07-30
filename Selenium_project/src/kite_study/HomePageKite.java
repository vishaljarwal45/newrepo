package kite_study;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageKite {

	@FindBy(xpath = "//span[@class='user-id']")  private  WebElement  UID;
	
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement Logout;
	
	
	
	public HomePageKite(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	
	 public void UID() {
		 String expectedoutput = "ELR321";
		  String actuloutput = UID.getText();
		 if(expectedoutput.equals(actuloutput)) {
			 System.out.println("test case pass");}
			 
			 else	 {
				 System.out.println("test case fail");
			 }
			 
			 UID.click();
		 }
	 
	
	public void Logout() throws InterruptedException {
		Thread.sleep(200);
		Logout.click();
	}
	
	
	
}
