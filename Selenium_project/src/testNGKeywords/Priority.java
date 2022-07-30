package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	  @Test(priority = 3)
	  public void a() {
		   Reporter.log("this is a",true);
	  }
	  
	  @Test(priority=0)
	  public void b() {
		   Reporter.log("this is b",true);
	  }
	  
	  @Test(priority=5)
	  public void c() {
		   Reporter.log("this is c",true);
	  }
	  
	  @Test(priority=-1)
	  public void f() {
		   Reporter.log("this is f",true);
	  }
	  
	  @Test(priority=-9)
	  public void d() {
		   Reporter.log("this is d",true);
	  }
	  
	  @Test
	  public void e() {
		   Reporter.log("this is e",true);
	  }
	  
	  
}
