package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;
import selenium.Data;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	@CacheLookup
	private WebElement btnUser;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement lnkCreate;

	@FindBy(how = How.ID, using = "miceImg")
	private WebElement miceCategory;

	@FindBy(how = How.XPATH, using = "//*[@id=\"details_10\"]")
	private WebElement invalidProduct;

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement btnSearch;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement boxSearch;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement pageLoad;

	public void enterHome() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void clickMenuUser() {
		btnUser.click();
	}

	public void clickCreateAccount() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", lnkCreate);
//		lnkCreate.sendKeys(Keys.ENTER);
	}

	public void clickMiceCategory() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", miceCategory);
	}

	public void clickInvalidProduct() {
		invalidProduct.click();
	}

	public void clickBtnSearch() {
		btnSearch.click();
	}

	public void enterProduct(String product) {
		boxSearch.sendKeys(product);
		boxSearch.sendKeys(Keys.ENTER);
	}

	public void enterInvalidProduct(String invalidProduct) {
		boxSearch.sendKeys(invalidProduct);
		boxSearch.sendKeys(Keys.ENTER);
	}

	public void fillBoxSearch() throws Exception {

		enterProduct(Data.nameLaptop());
	}

	public void fillBoxInvalidSearch() throws Exception {

		enterInvalidProduct(Data.nameInvalid());
	}

	public void waitElement() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(pageLoad));
	}

}
