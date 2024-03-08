package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public WebDriver driver;

		
		
	public WebDriver Webdrivermanager() throws IOException 
	
	
	 


	 {  FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\extent.properties");
		Properties sk=new Properties();
		sk.load(file);
		
		
		if(driver==null) {
	
		  driver=new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); 
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		 return driver;
		 
	 }
   
}
