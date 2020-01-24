package br.com.rsinet.HUB_BDD.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.HUB_BDD.managers.FileReaderManager;
import br.com.rsinet.HUB_BDD.selenium.TimeDescription;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "stepDefinition", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }

//		,dryRun = true
		, monochrome = true)
//		, tags = { "@InvalidClickSearch" })

public class TestRunner {

	public static String folderPath = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"
			+ TimeDescription.horas();

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

	@BeforeClass
	public static void createPrintFolder() {
		File folderScreenshot = new File(folderPath);
		folderScreenshot.mkdir();
	}

}
