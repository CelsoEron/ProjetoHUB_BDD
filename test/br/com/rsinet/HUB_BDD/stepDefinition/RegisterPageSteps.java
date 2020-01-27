package br.com.rsinet.HUB_BDD.stepDefinition;

import com.cucumber.listener.Reporter;

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
		
		Reporter.addStepLog("Preenche os campos da Conta");
	}
	
	@When("^usuario insere os dados pessoais$")
	public void usuario_insere_os_dados_pessoais() {
		registerPage.fillPersonalDetails();
		
		Reporter.addStepLog("Preenche os campos Pessoais da Conta");
	}

	@When("^usuario insere os dados de endereco$")
	public void usuario_insere_os_dados_de_endereco() {
		registerPage.fillAddress();
		
		Reporter.addStepLog("Preenche os campos de endereço da Conta");
	}

	@Then("^usuario conclui o cadastro$")
	public void usuario_conclui_o_cadastro() {
		registerPage.clickAgree(true);
		registerPage.clickBtnRegister(true);
		registerPage.rollDown();
		
		Reporter.addStepLog("Aceita os termos e no botão de Registro");
	}

	// invalido
	@When("^usuario insere os dados pessoais invalidos$")
	public void usuario_insere_os_daods_pessoais_invalidos() {
		registerPage.fill_InvalidAccountDetails();
		
		Reporter.addStepLog("Preenche os campos da Conta com dados inválidos");
	}
}
