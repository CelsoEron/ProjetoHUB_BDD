package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
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

	// Registro valido
	@When("^User enters Account Details$")
	public void user_enters_Account_Details() {
		registerPage.fill_AccountDetails();
	}
	
	@And("^User enters Personal Details$")
	public void user_enters_Personal_Details() {
		registerPage.fillPersonalDetails();
	}

	@And("^User enters Address$")
	public void user_enters_Address() {
		registerPage.fillAddress();
	}

	@And("^Click in agree terms and Register button$")
	public void click_In_Agree_Terms_And_Register_Button() {
		registerPage.clickAgree(true);
		registerPage.clickBtnRegister(true);
	}

	@Then("^Message displayed Register Successfully$")
	public void message_displayed_Register_Successfully() {
	}

	// invalido
	@When("^User enters invalid Account Details$")
	public void user_enters_invalid_Account_Details() {
		registerPage.fill_InvalidAccountDetails();
	}
	
	@Then("^Message displayed Register Failed$")
	public void message_displayed_Register_Failed() {
		registerPage.rollDown();
	}
}
