package stepDefination;



import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code
    	System.out.println("given");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        //code
    	System.out.println("when");
    }

    @Then("^homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        //code
    	System.out.println("then");
    }

    @And("^cards are displayed  $")
    public void cards_are_displayed() throws Throwable {
        //code
    	System.out.println("and");
    }

}