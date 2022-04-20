package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP 15\\eclipse-Sample\\Cucumber"
		+ "\\src\\main\\java\\feature\\file", glue = {"stepdefinitions"},
		monochrome=true, dryRun=true)


public class runner {
}
