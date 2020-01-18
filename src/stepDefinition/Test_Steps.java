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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/");
	}

	@When("^User Navigate to Register Page$")
	public void user_Navigate_to_Register_Page() throws Exception {
		driver.findElement(By.id("menuUserLink")).click();
		WebElement createAcc = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(createAcc));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", createAcc);
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys(username);
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(password);
	}

//	@When("^User enters Data to Register$")
//	public void user_enters_Data_to_LogIn() {
//		driver.findElement(By.name("usernameRegisterPage")).sendKeys("eronCelso");
//		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Test1234");
//		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Test1234");
//		driver.findElement(By.name("emailRegisterPage")).sendKeys("celso.silva@rsinet.com.br");
//		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Celso Eron");
//		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("de Almeida Silva");
//		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("11996980807");
//		Select oSelect = new Select(driver.findElement(By.className("countryListBoxRegisterPage")));
//		oSelect.selectByVisibleText("Brasil");
//		driver.findElement(By.name("cityRegisterPage")).sendKeys("Cotia");
//		driver.findElement(By.name("addressRegisterPage")).sendKeys("R Maria Catarina");
//		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("SP");
//		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("06727182");
//		driver.findElement(By.id("i_agree")).click();
//
//	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {
		System.out.println("Registro efetuado com sucesso !");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() {
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[3]")).click();
	}

	@Then("^Message displayed Register Successfully$")
	public void message_displayed_LogOut_Sucessfully() {
		System.out.println("LogOut efetuado com sucesso !");
		driver.close();
	}
}
