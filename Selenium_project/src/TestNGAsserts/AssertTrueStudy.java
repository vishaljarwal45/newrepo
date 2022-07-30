package TestNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void truefalse() {
	  
	  String result = "true";
	  
	  Assert.assertTrue(true," result is false");
	  
  }
}
