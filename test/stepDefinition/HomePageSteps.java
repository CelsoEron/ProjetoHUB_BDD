package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.ProductPage;

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
	public void user_click_in_Invalid_Product_chosen() throws InterruptedException {
		home.clickInvalidProduct();
		home.waitElement();
	}

	@When("^User click and input valid Search$")
	public void user_click_and_input_valid_Search() {
		home.clickBtnSearch();
		home.fillBoxSearch();
	}

	@When("^User click and input invalid Search$")
	public void user_click_and_input_invalid_Search() {
		home.clickBtnSearch();
		home.fillBoxInvalidSearch();
	}
}
