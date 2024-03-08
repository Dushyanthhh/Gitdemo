package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	public WebDriver driver;
	
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By search=(By.cssSelector("input[type='search']"));
	By getproduct=(By.xpath("//h4[text()='Tomato - 1 Kg']"));
	By topdeals=(By.xpath("//a[text()='Top Deals']")) ;     		
	By increment=(By.cssSelector("a.increment"));
	By addtocart=(By.xpath("//button[text()='ADD TO CART']"));
	public void getsearch(String name) 
	{
		
		driver.findElement(search).sendKeys(name);
	}
	
	public void incrementquanity(int  quanity) 
	{
		int i=quanity-1;
		while (i>0) {
			driver.findElement(increment).click();
			i--;
		}
		
		
	}
	public void addtoCart() {
		driver.findElement(addtocart).click();
		
	}
	
	
	public String getproduct() 
	{
		 return driver.findElement(getproduct).getText();
	}
	public void topdeals() {
		
		driver.findElement(topdeals).click();
	}
	

}