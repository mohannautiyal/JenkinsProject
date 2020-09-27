package com.fil.bdd;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
	
	WebActionSteps webAction;
	
	public LoginStepDefinition(WebActionSteps webAction) {
		this.webAction = webAction;
	}
	
	@Given("User launches the Application")
	public void user_launches_the_application() {
		webAction.LaunchApplication();
	}

	@Given("Enters {string} and {string}")
	public void enters_and(String string, String string2) {
	     System.out.println("User enters username and password");
	}
	
	@Then("Home Page should be dispalyed")
	public void home_page_should_be_dispalyed() {
	     System.out.println("Home Page is displayed");
	}
	
	
	@After
	public void close() {
		webAction.driver.quit();
	}
}
