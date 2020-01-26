package br.com.rsinet.HUB_BDD.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "HP Z3200 Wireless Mouse")
	private WebElement lnkProduct;

	@FindBy(how = How.LINK_TEXT, using = "HP Stream - 11-d020nr Laptop")
	private WebElement lnkTxtProduct;

	@FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div/div")
	private WebElement btnCloseSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
	private WebElement description;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement messageNotFound;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement pageLoad;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div")
	private WebElement pageLoadInvalid;

	public void close_Search() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("Laptop"));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", btnCloseSearch);
	}

	public void clickProduct() {
		lnkProduct.click();
	}

	public void clickTxtProduct() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", lnkTxtProduct);
	}

	public void checkTxtProduct() {
		assertEquals(lnkTxtProduct.getText().toString().toUpperCase(), description.getText());
	}

	public void checkClickProduct() {
		assertEquals(lnkProduct.getText().toString().toUpperCase(), description.getText());
	}

	public void checkNotFound() {
		assertEquals(messageNotFound.getText().contains("No results for"), true);
	}

	public void waitElement() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(pageLoad));
	}

	public void waitNotFound() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(pageLoadInvalid));
	}

}
