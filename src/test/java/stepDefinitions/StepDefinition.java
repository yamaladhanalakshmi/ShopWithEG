package stepDefinitions;

import Pages.CreateAccountPage;
import Pages.LandingPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class StepDefinition extends BaseClass{
	LandingPage landingPage=new LandingPage(driver);
	LoginPage loginPage=new LoginPage (driver);
	CreateAccountPage createAccountPage=new CreateAccountPage(driver);
	
	@Given("user launchesshopWithEG application")
	public void user_launchesshop_with_eg_application() {
	    driver.get("https://stg.shopwitheg.com/");
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		landingPage.clickLoginLink();
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	   loginPage.enterEmail("dhanasvp7@gmail.com");
	   loginPage.enterpassword("dhana@123");
	}

	@When("user clicks on signIn button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSigninLink();
	}

	@Then("user will be logged in")
	public void user_will_be_logged_in() {
		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	
		loginPage.enterEmail(string);
		loginPage.enterpassword(string2);
	}
	
	@When("user clicks on createaccount link")
	public void user_clicks_on_createaccount_link() {
		loginPage.clickCreateAccountLink()
	}
	
	@When("user clicks on createaccount button")
	public void user_clicks_on_createaccount_button() {
	    
	}

	@Then("user will be created account")
	public void user_will_be_created_account() {
	   
	}

	
	
	

}
