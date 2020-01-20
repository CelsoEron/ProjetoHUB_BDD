package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage home;

	private RegisterPage registerPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (home == null) ? home = new HomePage(driver) : home;
	}

	public RegisterPage getRegisterPage() {
		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;
	}

}