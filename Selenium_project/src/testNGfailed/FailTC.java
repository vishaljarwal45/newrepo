package testNGfailed;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTC {
	@Test
	  public void a() {
		Assert.fail();
		  Reporter.log("test a is running",true);
	  }
	  
	  @Test
	  public void b() {
		  Reporter.log("test b is running",true);
	  }
	  
	  @Test
	  public void c() {
		  Reporter.log("test c is running",true);
	  }
	  
	  @Test
	  public void d() {
		  Assert.fail();
		  Reporter.log("test d is running",true);
	  }
	  
	  @Test
	  public void e() {
		  Reporter.log("test e is running",true);
	  }
	  
	  @Test
	  public void f() {
		  Assert.fail();
		  Reporter.log("test f is running",true);
	  }
	  
	  @Test
	  public void g() {
		  Reporter.log("test g is running",true);
	  }
	  
	  @Test
	  public void h() {
		  Assert.fail();
		  Reporter.log("test h is running",true);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
}
