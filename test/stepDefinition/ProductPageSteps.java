package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductPage;

public class ProductPageSteps {

	TestContext testContext;
	ProductPage productPage;

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
}
