package step_defnition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.addingproducts;

public class addingproducts_testcase {
	addingproducts obj=new addingproducts();
	@Given("^: search for different products$")
	public void search_for_different_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.url("chrome");
	}

	@When("^: Add them to the cart$")
	public void add_them_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.search();
	}

	@Then("^: update the cart$")
	public void update_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.search2();
	}

	@Then("^: proceed to checkout$")
	public void proceed_to_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.update();
	}

}
