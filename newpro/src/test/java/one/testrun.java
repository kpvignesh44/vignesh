package one;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testrun {
	@RunWith(Cucumber.class)
	@CucumberOptions(features="feature/testcases.feature", glue="two")
	public class Testrunner_googlehomepage
	{
	}
}
