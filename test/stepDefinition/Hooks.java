package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;

public class Hooks {

	TestContext testContext;
	WebDriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getWebDriverManager();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();

	}

	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
