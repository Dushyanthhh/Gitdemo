package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genricutlis {
	public WebDriver driver;
	public Genricutlis(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void switchtochild() {
		
		 Set<String> ops = driver.getWindowHandles();
		 Iterator<String> dus = ops.iterator();
		 String parentwindow = dus.next();
		 String childwindow = dus.next();
		 driver.switchTo().window(childwindow);
	}
	
	
}
