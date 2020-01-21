package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
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
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", invalidProduct);
	}

}