package stepDefinition;


	
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class StepDefinition 
	{

		@Given("^User is on Login page$")
		public void user_is_on_Login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User is on Login page");
		}
	    
	    @When("^User Login into Application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_Login_into_Application_with_and_password(String arg1, String arg2) throws Throwable {
	    	System.out.println(arg1);
	    	System.out.println(arg2);
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("Home page is populated");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	        System.out.println("Cards are displayed");
	    }

	}



