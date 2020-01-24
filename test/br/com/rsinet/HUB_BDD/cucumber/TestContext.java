package br.com.rsinet.HUB_BDD.cucumber;

import br.com.rsinet.HUB_BDD.managers.PageObjectManager;
import br.com.rsinet.HUB_BDD.managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;

	}
}
