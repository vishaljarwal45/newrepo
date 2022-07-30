package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodStudy {
  @Test (timeOut=100,priority=0)
  
  
  public void carON() throws InterruptedException {
	  Thread.sleep(50);
	  Reporter.log("started the car", true);
	  
  }
  @Test(dependsOnMethods = "carON",priority=1)
  public void carRunning() {
	  Reporter.log("car is running");
  }
  
  @Test(priority=3)
  public void carStopped() {
	  Reporter.log("car has stopped");
	  
  }
  @Test(priority=4)
  public void carParked() {
	  Reporter.log("car had been parked");
  }
  
  
}
