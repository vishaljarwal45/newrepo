package AA_kiteBase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;


public class Base {
			
		protected WebDriver driver=null;

		@Parameters("browsername")
		
	public void openApplication(String browsername) {
		

		
if(browsername.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		  
		       driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get("https://kite.zerodha.com/");}
		       
		       else if(browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\lib\\geckodriver.exe") ;   	   
		    	   
		driver=new FirefoxDriver();
		 driver.get("https://kite.zerodha.com/");
		    	   
		    	   
		       }
		
driver.get("https://kite.zerodha.com/");
}}
