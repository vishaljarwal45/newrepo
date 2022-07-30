package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
  @BeforeMethod
  
  public void login() {
	  
	  Reporter.log("this is login",true);
  }
  
  @Test
  public void homepage() {
	  Reporter.log("this is homepage");
	  
  }
 @AfterMethod
 
 public void closebrowser()
 {
	 Reporter.log("this is of afterclass closebrowser method",true);
 }  
  
  
  
  
  
  
  
  
  
}
