package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	public WebDriver driver;
	
	public Checkoutpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By cartbag=(By.cssSelector("img[alt='Cart']"));
	By checkout=(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
	By promobtn=(By.cssSelector("button[class='promoBtn']")) ;     		
	By placeorder=(By.xpath("//button[text()='Place Order']"));
	public void checkoutitems() 
	{
		
		driver.findElement(cartbag).click();
		driver.findElement(checkout).click();
		
	}
	public boolean verifypromo() 
	{
		  return driver.findElement(promobtn).isDisplayed();
	}
	public boolean verfyplaceorder() {
		
		return driver.findElement(placeorder).isDisplayed();
	}
	


}
