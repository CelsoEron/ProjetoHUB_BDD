package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement bxUsername;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement bxEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement bxPassword;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement bxConfirmPassword;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement bxFirstName;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement bxLastName;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement bxPhone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement bxCountry;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement bxCity;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement bxAdress;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement bxState;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement bxPostal;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement chkAgree;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnRegister;

	public void enterUsername(String userName) {
		bxUsername.sendKeys(userName);
	}

	public void enterEmail(String email) {
		bxEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
		bxPassword.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		bxConfirmPassword.sendKeys(confirmPassword);
	}

	public void enterFirstName(String firstName) {
		bxFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		bxLastName.sendKeys(lastName);
	}

	public void enterPhone(String phone) {
		bxPhone.sendKeys(phone);
	}

	public void enterCountry(String country) {
		Select selectCountry = new Select(bxCountry);
		selectCountry.selectByVisibleText(country);
	}

	public void enterCity(String city) {
		bxCity.sendKeys(city);
	}

	public void enterAddress(String adress) {
		bxAdress.sendKeys(adress);
	}

	public void enterState(String state) {
		bxState.sendKeys(state);
	}

	public void enterPostal(String postal) {
		bxPostal.sendKeys(postal);
	}

	public void clickAgree(boolean value) {
		if (value)
			chkAgree.click();
	}

	public void clickBtnRegister(boolean value) {
		if (value)
			btnRegister.click();
	}

	public void fill_RegisterDetails() {
		enterUsername("Automation");
		enterEmail("celsoautomation@test.com");
		enterPassword("Test1234");
		enterConfirmPassword("Test1234");
	}

	public void fillPersonalDetails() {
		enterFirstName("Automation");
		enterLastName("Test");
		enterPhone("1122334455");
	}

	public void fillAddress() {

		enterCity("São Paulo");
		enterAddress("Rua Teste");
		enterPostal("123456");
		enterState("São Paulo");
		enterCountry("Brazil");
	}
}
