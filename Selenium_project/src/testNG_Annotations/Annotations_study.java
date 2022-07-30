package testNG_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations_study {
  @Test
  public void homepage() {
	  Reporter.log("this is homepage test method", true);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
       Reporter.log("this is before ,method", true);
  }
  public void NewBeforeMethod() {
	  Reporter.log("this is before method 2",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("this is after method",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("this is before class",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("this is after class",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("this is before test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("this is after test",true);
  }

  @Test
  public void testclass2() {
	  Reporter.log("this is new test class method2",true );
	  
	  
  }
  
  
}
