package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "HP Z3200 Wireless Mouse")
	private WebElement lnkProduct;

	public void clickProduct() {
		lnkProduct.click();
	}

}
