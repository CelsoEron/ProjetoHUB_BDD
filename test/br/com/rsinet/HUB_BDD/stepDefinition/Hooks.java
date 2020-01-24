package br.com.rsinet.HUB_BDD.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.HUB_BDD.cucumber.TestContext;
import br.com.rsinet.HUB_BDD.managers.WebDriverManager;
import br.com.rsinet.HUB_BDD.runners.TestRunner;
import br.com.rsinet.HUB_BDD.selenium.Wait;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver;
	TestContext testContext;
	WebDriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getWebDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {
		Wait.waitForPageLoad(driver);
		Wait.untilJqueryIsDone(driver);
		Wait.untilPageLoadComplete(driver);

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
				.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(TestRunner.folderPath + "/" + screenshotName + ".png");

		Files.copy(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
