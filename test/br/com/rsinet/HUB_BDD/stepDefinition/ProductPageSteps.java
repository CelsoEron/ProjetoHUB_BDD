package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.rsinet.HUB_BDD.cucumber.TestContext;
import br.com.rsinet.HUB_BDD.managers.WebDriverManager;
import br.com.rsinet.HUB_BDD.pageObjects.ProductPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductPageSteps {

	WebDriver driver;
	TestContext testContext;
	ProductPage productPage;
	WebDriverManager manager;

	public ProductPageSteps(TestContext context) {
		testContext = context;
		productPage = testContext.getPageObjectManager().getProductPage();
	}

	@Then("^escolher o produto$")
	public void escolher_o_produto() {
		productPage.clickProduct();
		productPage.checkClickProduct();
		Reporter.addStepLog("Clicar no produto da Home Page");
	}

	@When("^usuario escolhe produto$")
	public void usuario_escolhe_produto() throws InterruptedException {
		productPage.close_Search();
		productPage.clickTxtProduct();
		productPage.checkTxtProduct();
		
		Reporter.addStepLog("Fecha a caixa de pesquisa e clica no produto selecionado por texto");
	}

	@Then("^verifica pesquisa$")
	public void verifica_pesquisa() {
		productPage.checkNotFound();
		productPage.waitNotFound();
	}

}
