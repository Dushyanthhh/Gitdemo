package StepDefinations;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobject.Homepage;
import Pageobject.Projectmanager;
import Utils.Textcontex;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagestepdefination {
	
   public Projectmanager projectmanager;
    Textcontex test;
    public Homepage homepage;
 public Homepagestepdefination(Textcontex test) {
	 
	 this.test=test;
	 this. homepage= test.projectmanager.getlandingpage();

 }   
    
@Given("user is on landing page")
         public void user_is_on_landing_page() {
        

	
}
@When("^user search with shortname (.+) in homepage and extract the acutal product name$")
public void user_search_with_shortname_in_homepage_and_extract_the_acutal_product_name(String name) throws InterruptedException {
	
	
	
	
	   homepage.getsearch(name);
	   Thread.sleep(1000);
	   homepage.getproduct().split("-")[0].trim();
	
	
}
@When("Added  {string} items to selected product to cart")
public void added_items_to_selected_product_to_cart(String quanity) {
	
	homepage.incrementquanity(Integer.parseInt(quanity));
    homepage.addtoCart();
}
  int a=1;
 
}
