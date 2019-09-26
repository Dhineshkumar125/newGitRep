package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {

@Given("the driver is launched")
public void the_driver_is_launched() 
	{
	System.out.println("driver is launched");
	}

@Given("navigated the URL")
public void navigated_the_URL() 
	{
	System.out.println("navigating to the url");
	}

@When("user enters the username")
public void user_enters_the_username() 
	{
    System.out.println("username entered");
	}

@When("enters password")
public void enters_password()
	{
	System.out.println( "password enteres");
	}

@When("clicks on the login")
public void clicks_on_the_login() 
	{
	System.out.println("login button clicked");
    }

@Then("validate the login is successful")
public void validate_the_login_is_successful() 
	{
	System.out.println("login successful");
	}
}
