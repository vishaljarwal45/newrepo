package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOuts {
	  @Test(timeOut=1000)
	  public void a() throws InterruptedException {
		  Thread.sleep(900);
		   Reporter.log("this is a",true);
	  }
	  
	  @Test
	  public void b() {
		   Reporter.log("this is b",true);
	  }
	  
	  @Test(timeOut=600)
	  public void c() throws InterruptedException {
		  Thread.sleep(700);
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
