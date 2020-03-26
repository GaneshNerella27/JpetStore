package step_defnition;


	import java.io.IOException;



	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
import pages.search_page;

	public class search_steps {
		search_page jps=new search_page();
		@Given("^:open the jpet website$")
		public void open_the_jpet_website() {
			//* calling the method using object *//
		   jps.url("chrome");
		}

		@When("^:enter the item name$")
		public void enter_the_item_name() {
			//* calling the method using object *//
		    jps.JpetSearch();
		}

		@Then("^:Click on search bar$")
		public void click_on_search_bar() throws IOException, InterruptedException  {
			//* calling the method using object *//
			jps.click();
			jps.Screenshot("/JPET/screenshot.png");
			
		   
		}

		@Then("^:close the website$")
		public void close_the_website() throws InterruptedException 
		{
			//* calling the method using object *//
		   jps.close();
		
		}
}
