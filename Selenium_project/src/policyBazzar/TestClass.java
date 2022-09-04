package policyBazzar;

import java.io.IOException;  

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.class)
public class TestClass extends Base {
	
 
	HomePage home;
	
  @BeforeClass
  public void launchBrowser() throws IOException {
	  initializebrowser();
	  home=new HomePage(driver);
	  
  }
  @Test
  public void openTermLife() throws InterruptedException {
	  
	  home.OpenTermLife();
	  Utility.ImplicitlyWait(driver);
	  
	   }
  @Test
  public void sendName() throws IOException {
	  Utility.ImplicitlyWait(driver);

	  home.addName(Utility.GetDataFromPropertiesfiles("NAME"));
  }
  @Test
  public void sendDOB() throws IOException {
	  Utility.ImplicitlyWait(driver);

	  home.AddDOB(Utility.GetDataFromPropertiesfiles("DOB"));
  }
  @Test
  public void sendMOB() throws IOException {
	  Utility.ImplicitlyWait(driver);

	  home.addMobilNum(Utility.GetDataFromPropertiesfiles("MOB"));
	 
	  
  }
  
  @Test
  public void sumitButton() {
	  Utility.ImplicitlyWait(driver);
	  home.SubmitButton();
	  

  }
  
  
  
  
}
