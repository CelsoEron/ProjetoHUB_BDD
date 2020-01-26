package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.cucumber.TestContext;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.selenium.Constant;
import br.com.rsinet.HUB_BDD.selenium.ExcelUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	HomePage home;
	WebDriver driver;
	WebDriverWait wait;
	TestContext testContext;

	public HomePageSteps(TestContext context) throws Exception {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
		ExcelUtils.setProdutosFile(Constant.Path_TestData + Constant.File_TestData, "Produtos");
	}

	@Given("^usuario na home page$")
	public void usuario_na_home_page() {
		home.enterHome();
	}

	@When("^usuario navega ate a pagina de cadastro$")
	public void usuario_navega_ate_a_pagina_de_cadastro() {
		home.clickMenuUser();
		home.clickCreateAccount();
	}

	@When("^Clicar na categoria$")
	public void Clicar_na_categoria() {
		home.clickMiceCategory();
	}

	@When("^usuario clica no produto$")
	public void usuario_clica_no_produto() throws InterruptedException {
		home.clickInvalidProduct();
		home.waitElement();
	}

	@When("^usuario pesquisa produto valido$")
	public void usuario_pesquisa_produto_valido() throws Exception {
		home.clickBtnSearch();
		home.fillBoxSearch();
	}

	@When("^usuario pesquisa produto invalido$")
	public void usuario_pesquisa_produto_invalido() throws Exception {
		home.clickBtnSearch();
		home.fillBoxInvalidSearch();

	}
}
