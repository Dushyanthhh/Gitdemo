package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerspage {
	public WebDriver driver;
	public Offerspage(WebDriver driver) 
	{
		this.driver=driver;
	}

	By search=(By.cssSelector("input[type='search']"));
	By getofferpage=(By.xpath("//tbody/tr/Td[1]"));
	
	public void searchofferpage(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);
	}
	public String  getofferpage() {
		
		 return driver.findElement(getofferpage).getText();
	}
	
	
	
}
