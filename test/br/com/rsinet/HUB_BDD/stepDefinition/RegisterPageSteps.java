package br.com.rsinet.HUB_BDD.stepDefinition;

import br.com.rsinet.HUB_BDD.cucumber.TestContext;
import br.com.rsinet.HUB_BDD.pageObjects.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageSteps {

	TestContext testContext;
	RegisterPage registerPage;

	public RegisterPageSteps(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}

	// Registro valido
	@When("^usuario insere os dados da conta$")
	public void usuario_insere_os_dados_da_conta() {
		registerPage.fill_AccountDetails();
	}
	
	@When("^usuario insere os dados pessoais$")
	public void usuario_insere_os_dados_pessoais() {
		registerPage.fillPersonalDetails();
	}

	@When("^usuario insere os dados de endereco$")
	public void usuario_insere_os_dados_de_endereco() {
		registerPage.fillAddress();
	}

	@Then("^usuario conclui o cadastro$")
	public void usuario_conclui_o_cadastro() {
		registerPage.clickAgree(true);
		registerPage.clickBtnRegister(true);
		registerPage.rollDown();
	}

	// invalido
	@When("^usuario insere os dados pessoais invalidos$")
	public void usuario_insere_os_daods_pessoais_invalidos() {
		registerPage.fill_InvalidAccountDetails();
	}
}
