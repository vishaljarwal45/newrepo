package TestNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
  @Test
  public void  equals () {
	  
	  
	  String Expected="Vishal";
	  String Actual="Vishal";
	  
	  Assert.assertEquals( Actual,Expected,"result is not matching");}
	  
	 @Test
	 public void notEqualsmethod() {
	  String Expected2="Vishal";
	  String Actual2="vishal";
	  
	  Assert.assertNotEquals( Actual2,Expected2,"result is not matching");
	  
	  
	 }
	  
	  
  }

