package step_defnition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Webtable_main;

public class Webtable_steps {
	
	Webtable_main web=new Webtable_main();
	@Given("^the details of an animal in the homepage$")
	public void the_details_of_an_animal_in_the_homepage()  {
		//* calling the method using object *//
	   web.url("chrome");
	}

	@When("^the details are matched$")
	public void the_details_are_matched()  {
		//* calling the method using object *//
	    web.jpet_print();
	}

	@Then("^the selected animals details are printed$")
	public void the_selected_animals_details_are_printed()  {
		//* calling the method using object *//
	    web.verify();
	}

	@Then("^details are printed in a table$")
	public void details_are_printed_in_a_table() {
		//* calling the method using object *//
	   web.submit();
	}


}

		