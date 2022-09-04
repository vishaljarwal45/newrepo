package policyBazzar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.math3.analysis.solvers.FieldBracketingNthOrderBrentSolver;
import org.openqa.selenium.WebDriver;

public class Utility {

	
	public static String GetDataFromPropertiesfiles(String key) throws IOException {
		
		Properties obj=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\icon\\git\\newrepo\\Selenium_project\\myproperty.properties");
		
		
		obj.load(myfile);
	String	value= obj.getProperty(key);
		return value;
	}
		
		public static void ImplicitlyWait(WebDriver driver) {
			
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	

