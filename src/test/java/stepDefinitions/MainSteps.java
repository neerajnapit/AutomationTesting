package stepDefinitions;

import io.cucumber.java.en.*;

public class MainSteps {
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on netbanking landing page");
	}
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User login into application");
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Home page is displayed");
	}
	@And("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cards are displayed");
	}

}
