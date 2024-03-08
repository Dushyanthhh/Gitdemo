package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Utils.Textcontex;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	Textcontex test;
public Hooks(Textcontex test)
	
	{
		this.test=test;
		
	}
	 

     @After
       public void teardown() throws IOException {
    	   
    	   
    	   test.testbase.Webdrivermanager().quit();
    	   
       }
     @AfterStep
     public void addscreenshot(Scenario scenario) throws  IOException {
    	 WebDriver driver = test.testbase.Webdrivermanager();
    	 if (scenario.isFailed())
    	 {
    		 File sep = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		  byte[] fop = FileUtils.readFileToByteArray(sep);
    		  scenario.attach(fop,"image/png","image");
		}
    	 
     }


}  
