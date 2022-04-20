package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	@Given("Open the firefox & start application")
	public 
	void open_the_firefox_start_application() {
	    System.out.println("Open the firefox & start application");
	}

	@When("I enter valid username & password")
	public void i_enter_valid_username_password() {
	    System.out.println("I enter valid username & password");
	}

	@Then("user should able to login successfully")
	public void user_should_able_to_login_successfully() {
	    System.out.println("user should able to login successfully");
	}

	}
