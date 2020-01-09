package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(List<stepDefinition.Credentials> usercredentials) throws Throwable {
		Thread.sleep(4000);
		for (stepDefinition.Credentials credentials : usercredentials) {
			driver.findElement(By.name("username")).sendKeys(credentials.getUsername());
			driver.findElement(By.name("password")).sendKeys(credentials.getPassword());
			driver.findElement(By.id("sign_in_btnundefined")).click();
		}
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login efetuado com sucesso !");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[3]")).click();
	}

	@Then("^Message displayed LogOut Sucessfully$")
	public void message_displayed_LogOut_Sucessfully() throws Throwable {
		Thread.sleep(3000);
		System.out.println("LogOut efetuado com sucesso !");
		driver.close();
	}
}
