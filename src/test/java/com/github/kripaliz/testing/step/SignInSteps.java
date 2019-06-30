package com.github.kripaliz.testing.step;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.kripaliz.automation.step.StepDef;
import com.github.kripaliz.testing.pageobject.AnukoHomePage;
import com.github.kripaliz.testing.pageobject.AnukoLoginPage;
import com.github.kripaliz.testing.pageobject.TimePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author kkurian
 *
 */
@StepDef
public class SignInSteps {

	@Autowired
	private AnukoHomePage anukoHomePage;
	
	@Autowired
	private AnukoLoginPage anukoLoginPage;
	
	@Autowired
	private TimePage timePage;
	
	String username;
	
	@Given("^I visit Anuko Home Page$")
	public void i_visit_Anuko_Home_Page() throws Exception {
	    anukoHomePage.visitUrl();
	}

	@Given("^I goto Login page$")
	public void i_goto_Login_page() throws Exception {
	    anukoHomePage.clickOnLoginLink();
	}

	@When("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_with_UnifiedBdd_and_UnifiedBddAutomation(String inputUsername, String inputPassword) throws Exception {
		username = inputUsername;
	    anukoLoginPage.enterUsername(inputUsername);
	    anukoLoginPage.enterPassword(inputPassword);
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Exception {
		anukoLoginPage.clickOnLoginButton();
	}

	@Then("^the username is displayed on the Time Tracker Home page$")
	public void the_username_is_displayed_on_the_Time_Tracker_Home_page() throws Exception {
		final String accountHeaderDetails = timePage.getUserSummaryDetailsText();
		assertThat(accountHeaderDetails).contains(username);
	}
	
}
