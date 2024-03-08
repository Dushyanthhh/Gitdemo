package StepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import Pageobject.Homepage;
import Pageobject.Offerspage;
import Utils.Textcontex;
import io.cucumber.java.en.Then;

public class Offerspagestepdefination {
	Textcontex test;
	public String offerspage;
	public Offerspagestepdefination(Textcontex test) 
	{
		this.test=test;
	}

@Then("^user search with shortname (.+) in offerspage$")
public void user_search_with_shortname_in_offerspage(String shortname) {
	switchtowindow();
	Offerspage offerpage=test.projectmanager.offerspage();
    offerpage.searchofferpage(shortname);
	offerpage.getofferpage();
}

public void switchtowindow() {
      
    Homepage m=test.projectmanager.getlandingpage();
	m.topdeals();
	test.generic.switchtochild();
	
	
}
@Then("validate product name in offerspage is matching with homepage")
public void validate_product_name_in_offerspage_is_matching_with_homepage() {
  Assert.assertEquals(offerspage,test.homepage);
  
  
}


}
