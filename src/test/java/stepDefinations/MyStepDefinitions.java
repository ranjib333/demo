package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User on NetBanking landing page$")
    public void user_on_netbanking_landing_page() throws Throwable {
    	System.out.println("navigate to login_Url");
       
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    System.err.println(strArg1);
    System.err.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("validate homepage");
        
    }

    @And("^Cards are dispalay are \"([^\"]*)\"$")
    public void cards_are_dispalay_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
        
    }

}