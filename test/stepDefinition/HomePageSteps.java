package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	HomePage home;
	WebDriver driver;
	WebDriverWait wait;
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
		home.clickCreateAccount();
	}

	@When("^User click in Product Category chosen$")
	public void user_click_in_Product_Category_chosen() {
		home.clickMiceCategory();
	}

	@When("^User click in Invalid Product chosen$")
	public void user_click_in_Invalid_Product_chosen() {
		home.clickInvalidProduct();
	}

}
