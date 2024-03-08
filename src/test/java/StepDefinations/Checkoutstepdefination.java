package StepDefinations;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import Pageobject.Checkoutpage;
import Utils.Textcontex;
import io.cucumber.java.en.Then;

public class Checkoutstepdefination {
	Textcontex test;
	public Checkoutpage checkoutpage;
	   
	public Checkoutstepdefination(Textcontex test)
	
	{
		this.test=test;
		this.checkoutpage=test.projectmanager.checkoutpage();
	}
	
	
	@Then("User procceds to checkout")
	public void user_procceds_to_checkout() {
		
		checkoutpage.checkoutitems();
		
	    
	}
	@Then("verify user has ability to entry promo code and place the order")
	public void verify_user_has_ability_to_entry_promo_code_and_place_the_order() {
		
		Assert.assertTrue(checkoutpage.verifypromo());
	    Assert.assertTrue(checkoutpage.verfyplaceorder());
		
	}


}
