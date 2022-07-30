package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	  @Test(invocationCount = 3)
	  public void a() {
		   Reporter.log("this is a",true);
	  }
	  
	  @Test(invocationCount =2)
	  public void b() {
		   Reporter.log("this is b",true);
	  }
	  
	  @Test
	  public void c() {
		   Reporter.log("this is c",true);
	  }
	  
	  @Test
	  public void f() {
		   Reporter.log("this is f",true);
	  }
	  
	  @Test
	  public void d() {
		   Reporter.log("this is d",true);
	  }
	  
	  @Test
	  public void e() {
		   Reporter.log("this is e",true);
	  }
	  
	  
}
