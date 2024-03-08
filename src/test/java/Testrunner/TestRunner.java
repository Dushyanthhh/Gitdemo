package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="StepDefinations",
monochrome=true,tags="@logesh or @arun",
plugin={"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed-scenarios.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
