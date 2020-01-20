package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class Test_Steps {
	WebDriver driver;
	HomePage home;
	RegisterPage registerPage;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/");
	}

	@When("^User Navigate to Register Page$")
	public void user_Navigate_to_Register_Page() throws Exception {
		home = new HomePage(driver);

		home.clickMenuUser();
		home.clickCreateAccount(driver);

	}

	@When("^User enters Account Details$")
	public void user_enters_Account_Details(String userName, String email, String password, String confirmPassword) {

		registerPage.enterUsername(userName);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(confirmPassword);
		registerPage.enterEmail(email);
	}

	@And("^User enters Personal Details$")
	public void user_enters_Personal_Details(String firstName, String lastName, String phone) {
		registerPage = new RegisterPage(driver);

		registerPage.enterFirstName(firstName);
		registerPage.enterLastName(lastName);
		registerPage.enterPhone(phone);
	}

	@And("^User enters Address$")
	public void user_enters_Address(String country, String city, String address, String state, String postal) {
		registerPage = new RegisterPage(driver);

		registerPage.enterCountry(country);
		registerPage.enterCity(city);
		registerPage.enterAddress(address);
		registerPage.enterState(state);
		registerPage.enterPostal(postal);
	}

	@When("^Agree the Terms$")
	public void agree_the_Terms() throws Throwable {
		registerPage = new RegisterPage(driver);

		registerPage.clickAgree(true);
	}

	@Then("^Message displayed Register Successfully$")
	public void message_displayed_Register_Sucessfully() {
		System.out.println("Registro efetuado com sucesso");
		driver.close();
	}
}
