package br.com.rsinet.HUB_BDD.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProductPage;
import br.com.rsinet.HUB_BDD.pageObjects.RegisterPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage home;

	private RegisterPage registerPage;

	private ProductPage productPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (home == null) ? home = new HomePage(driver) : home;
	}

	public RegisterPage getRegisterPage() {
		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;
	}

	public ProductPage getProductPage() {
		return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
	}

}