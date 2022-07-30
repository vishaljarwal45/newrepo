package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Study {
	  @Test(enabled=false)
	  public void a() {
		   Reporter.log("this is a",true);
	  }
	  
	  @Test
	  public void b() {
		   Reporter.log("this is b",true);
	  }
	  
	  @Test(enabled=true)
	  public void c() {
		   Reporter.log("this is c",true);
	  }
	  
	  @Test(enabled=false)
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
