package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	HomePage home;
	WebDriver driver;
	TestContext testContext;

	public HomePageSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		home.enterHome();
	}

	@When("^User Navigate to Register Page$")
	public void user_Navigate_to_Register_Page() {
		home.clickMenuUser();
		home.clickCreateAccount(driver);
	}

}
