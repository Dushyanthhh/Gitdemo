package Pageobject;

import org.openqa.selenium.WebDriver;

import Utils.Textcontex;


public class Projectmanager {
	public Homepage homepage;
	public WebDriver  driver;
	public Offerspage offerspage;
	public Checkoutpage checkoutpage;
   
	public  Projectmanager(WebDriver driver)
    {
    	
    	this.driver=driver;
    }
    public  Homepage getlandingpage()
    {
    	
 	   return  homepage= new Homepage(driver);
 	   
    }
    public Offerspage offerspage() {
    	
    	 return offerspage=new Offerspage(driver);
    }
      public  Checkoutpage checkoutpage() {
    	  
    	  return checkoutpage=new Checkoutpage(driver);
	   
   }
    
    
    
    
    
}



