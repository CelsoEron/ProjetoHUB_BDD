package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver;
	private static JavascriptExecutor executor;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/");
	}

	@When("^User Navigate to Register Page$")
	public void user_Navigate_to_Register_Page() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
		executor.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));
	}

	@When("^User enters Data to Register$")
	public void user_enters_Credentials_to_LogIn(List<stepDefinition.Data> userdata) throws Throwable {
		for (stepDefinition.Data data : userdata) {
			driver.findElement(By.name("usernameRegisterPage")).sendKeys(data.getUsername());
			driver.findElement(By.name("passwordRegisterPage")).sendKeys(data.getPassword());
			driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(data.getConfirmPassword());
			driver.findElement(By.name("emailRegisterPage")).sendKeys(data.getEmail());
			driver.findElement(By.name("first_nameRegisterPage")).sendKeys(data.getFirstName());
			driver.findElement(By.name("last_nameRegisterPage")).sendKeys(data.getLastName());
			driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(data.getPhone());
			driver.findElement(By.name("")).sendKeys(keysToSend);
			driver.findElement(By.name("cityRegisterPage")).sendKeys(data.getCity());
			driver.findElement(By.name("addressRegisterPage")).sendKeys(data.getAdress());
			driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(data.getState());
			driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(data.getPostalCode());
			driver.findElement(By.id("i_agree")).click();
			
		}
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Registro efetuado com sucesso !");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[3]")).click();
	}

	@Then("^Message displayed LogOut Sucessfully$")
	public void message_displayed_LogOut_Sucessfully() throws Throwable {
		System.out.println("LogOut efetuado com sucesso !");
		driver.close();
	}
}
