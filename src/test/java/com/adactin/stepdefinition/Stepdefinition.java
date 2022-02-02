package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.manager.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	// LoginPage lp = new LoginPage(driver);--> after pom page creation
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() {
		getUrl("https://adactinhotelapp.com/");

	}

	@When("^user enter the valid username \"([^\"]*)\" in the username field$")
	public void user_enter_the_valid_username_in_the_username_field(String userName) {

		valueToElement(pom.getLp().getUserName(), userName);

	}

	@When("^user enter the valid password \"([^\"]*)\" in the password field$")
	public void user_enter_the_valid_password_in_the_password_field(String arg1) throws Throwable {
		valueToElement(pom.getLp().getUserName(), arg1);
	}

	@When("^User is able to click the login button$")
	public void user_is_able_to_click_the_login_button() {
		// clickOnElement(lp.getLogin());

	}

	@Then("^User verify the hompage navigates to search hotel$")
	public void user_verify_the_hompage_navigates_to_search_hotel() {

	}

}
