 package AA_kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

      

public class UtilityNew {

	public static String  getdatafromPropertiesFile(String key) throws IOException {
		
		Properties obj=new Properties();
	  FileInputStream myfile=new FileInputStream("C:\\Users\\icon\\git\\newrepo\\Selenium_project\\myproperty.properties");
		
	                 obj.load(myfile);
	  String value = obj.getProperty(key);
		return value;
		
	}

	
	public static void waitTime(WebDriver driver) {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	
	
}
