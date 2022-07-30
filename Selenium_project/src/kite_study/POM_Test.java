package kite_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Test {

	public static void main(String[] args) throws InterruptedException {

 System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);
		
		
		Kite_loginpage login=new Kite_loginpage(driver);
		       login.SendUserId();
		       login.SendPassword();
		       login.ClickOnLogin();
				Thread.sleep(500);

		
		Pin_page pin=new Pin_page(driver);
		       pin.sendpin();
		       pin.submitButton();
				Thread.sleep(500);

		       
		       HomePageKite home=new HomePageKite(driver);
		       home.UID();
		       home.Logout();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
