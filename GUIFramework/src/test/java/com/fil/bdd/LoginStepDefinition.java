package com.fil.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
	
	@Given("User launches the Application")
	public void user_launches_the_application() {
	     System.out.println("User Launches the Application");
	}

	@Given("Enters {string} and {string}")
	public void enters_and(String string, String string2) {
	     System.out.println("User enters username and password");
	}
	
	@Then("Home Page should be dispalyed")
	public void home_page_should_be_dispalyed() {
	     System.out.println("Home Page is displayed");
	}
}
