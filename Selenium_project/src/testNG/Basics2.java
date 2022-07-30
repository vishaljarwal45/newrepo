package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basics2 {
  @Test
  public void test() {
	  
	  
	  System.out.println("this is response from printing statement");
	  
	  Reporter.log("this is reportar log withought boolean");
	  
	  Reporter.log("this is reporter log with boolean", true);

	  
	  
	  
	  
	  
	  
  }
}
