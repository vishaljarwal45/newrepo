package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsmethods {

	public static void main(String[] args) throws InterruptedException {

  
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).sendKeys("welcome vishal buy a macbook");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).clear();

		
		String text = driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8482825222");
		
		boolean clickbox = driver.findElement(By.xpath("//input[@id='continue']")).isEnabled();
		System.out.println(clickbox);
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
			Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Pass@123");
 		Thread.sleep(2000);

	     driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
			Thread.sleep(5000);

		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("macbook air m1");
			Thread.sleep(5000);
			
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(10000);

		

		 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();	
			Thread.sleep(10000);

			driver.findElement(By.xpath("(//input[@name='submit.buy-now'])[2]")).click();

			
			driver.findElement(By.xpath("(//input[@class='a-button-input'])[7]")).click();
			Thread.sleep(10000);
			
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
			Thread.sleep(5000);

		 driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
			Thread.sleep(5000);

		 driver.findElement(By.xpath("(//a[@class='a-declarative a-button-text '])[3]")).click();
			Thread.sleep(5000);

		 driver.findElement(By.xpath("//input[@id='pp-VqDSXX-362']")).sendKeys("648");	
		
	
	
	
	
	}
	
	
	

		
	}
 

