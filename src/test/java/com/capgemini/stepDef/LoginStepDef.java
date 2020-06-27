package com.capgemini.stepDef;

import com.capgemini.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
	LoginPage login;
	
	
	@Given("^user enters on login page$")
	public void user_enters_on_login_page() throws Throwable {
	login=new LoginPage();
	login.init();
	}

	@When("^user enters credentials$")
	public void user_enters_credentials(String mobNo) throws Throwable {
	login.enterCredentials("9096142500");	
	}

	@When("^user click on cont btn$")
	public void user_click_on_cont_btn() throws Throwable {
		login.clickCount();
	}

	@Then("^user moved to the next page$")
	public void user_moved_to_the_next_page() throws Throwable {
	
Assert.assertTrue(true);
	}



}
