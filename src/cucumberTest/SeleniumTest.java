package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//
//public class SeleniumTest {
//	private static WebDriver driver = null;
//	private static Select oSelect = null;
//
//	public static void main(String[] args) throws InterruptedException {
//		String signMessage = driver.findElement(By.id("signInResultMessage")).getText();
//		
//		System.out.println(signMessage);
//		
//		if (signMessage == "Incorrect user name or password.") {
//			driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
//
//			driver.findElement(By.name("usernameRegisterPage")).sendKeys("CelsoEron");
//			driver.findElement(By.name("emailRegisterPage")).sendKeys("celso.silva@rsinet.com.br");
//			driver.findElement(By.name("passwordRegisterPage")).sendKeys("Test1234");
//			driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Test1234");
//
//			driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Celso Eron");
//			driver.findElement(By.name("last_nameRegisterPage")).sendKeys("de Almeida Silva");
//			driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("11996980807");
//
//			oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
//			oSelect.selectByVisibleText("Brazil");
//
//			driver.findElement(By.name("cityRegisterPage")).sendKeys("Cotia");
//			driver.findElement(By.name("addressRegisterPage")).sendKeys("R Maria Catarina 190");
//			driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("São Paulo");
//			driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("06727182");
//
//			driver.findElement(By.name("i_agree")).click();
//			driver.findElement(By.id("register_btnundefined")).click();
//		} 
//		
//		driver.quit();
//	}
//}
