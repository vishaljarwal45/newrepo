package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnmethod2 {
	
	
  @Test()
  public void a() {
	  Reporter.log("a is running",true);
  }
  
  @Test(dependsOnMethods = "c")
  public void b() {
	  Reporter.log("b is running",true);
  }
  
  @Test (timeOut = 200)
  public void c() throws InterruptedException {
	  Thread.sleep(300);
	  Reporter.log("c is running",true);
  }
  
  @Test
  public void d() {
	  Reporter.log("d is running",true);
  }
  
  @Test
  public void e() {
	  Reporter.log("e is running",true);
  }
}
