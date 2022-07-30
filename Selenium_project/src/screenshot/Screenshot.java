package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot {



	public static void main(String[] args) throws IOException, InterruptedException {

   System.setProperty("webdriver.chrome.driver","C:\\selenium files\\lib\\chromedriver.exe");
   
   WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.apple.com/in/");
		Thread.sleep(2000);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
	  String random = RandomString.make(2);
		
		File dest=new File("C:\\selenium files\\Screenshot\\"+random+"snapshot.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// 
//   
//      String random= RandomString.make(3);
//   System.out.println(random);
//		
//		File dest=new File("C:\\selenium files\\Screenshot\\snapshot"+random+".png");
//		 
//		
//		org.openqa.selenium.io.FileHandler.copy(source, dest);
//		
		
		
		
		
		
		
		
		
	}

}
