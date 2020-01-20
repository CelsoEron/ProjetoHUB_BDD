package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RegisterPage;

public class RegisterPageSteps {

	TestContext testContext;
	RegisterPage registerPage;

	public RegisterPageSteps(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}

	@When("^User enters Account Details$")
	public void user_enters_Account_Details() {
		registerPage.fill_RegisterDetails();
	}

	@When("^User enters Personal Details$")
	public void user_enters_Personal_Details() {
		registerPage.fillPersonalDetails();
	}

	@When("^User enters Address$")
	public void user_enters_Address() {
		registerPage.fillAddress();
	}

	@When("^Agree the Terms$")
	public void agree_the_Terms() {
		registerPage.clickAgree(true);
	}

	@Then("^Message displayed Register Successfully$")
	public void message_displayed_Register_Successfully() {
	}

}
