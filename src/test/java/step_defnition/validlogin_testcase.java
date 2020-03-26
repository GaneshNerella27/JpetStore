package step_defnition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.validlogin;


public class validlogin_testcase {
    validlogin obj=new validlogin();
	@Given("^: enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
		obj.url("chrome");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^: click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.register();
	}

	@Then("^: open's the homepage$")
	public void open_s_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		obj.enter_details();
		
	}

	@Then("^: confirming the profile$")
	public void confirming_the_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj.close_registration();
	}

}
