package xmlTestNGgroups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test (groups = {"sanity"})
	  public void a() {
		   Reporter.log("this is a",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void b() {
		   Reporter.log("this is b",true);
	  }
	  
	  @Test(groups = {"sanity"})
	  public void c() {
		   Reporter.log("this is c",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void f() {
		   Reporter.log("this is f",true);
	  }
	  
	  @Test(groups = {"sanity","regression"})
	  public void d() {
		   Reporter.log("this is d",true);
	  }
}
