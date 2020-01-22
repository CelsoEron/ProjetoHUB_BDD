package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.WebDriverManager;
import pageObjects.ProductPage;

public class ProductPageSteps {

	WebDriver driver;
	TestContext testContext;
	ProductPage productPage;
	WebDriverManager manager;

	public ProductPageSteps(TestContext context) {
		testContext = context;
		productPage = testContext.getPageObjectManager().getProductPage();
	}

	@When("^User click in Product chosen$")
	public void user_click_in_Product_chosen() {
		productPage.clickProduct();
	}

	@Then("^Message displayed Search with Clicks Successfully$")
	public void message_displayed_Search_with_Clicks_Successfully() {
	}

	@When("^User click in Product chosen with Text$")
	public void user_click_in_Product_chosen_with_Text() throws InterruptedException {
		productPage.close_Search();
		productPage.clickTxtProduct();
	}

	@And("^Check name of chosen Product$")
	public void check_name_of_chosen_Product() {
		productPage.checkTxtProduct();
	}

	@When("^Check error message$")
	public void check_error_message() {
		productPage.checkNotFound();
	}

	@Then("^Message displayed Product chosen is different$")
	public void message_displayed_Product_chosen_is_different() {
	}

	@Then("^Message displayed Search with Text Box Failed$")
	public void message_displayed_Search_with_Text_Box_Failed() {
		
	}
}
