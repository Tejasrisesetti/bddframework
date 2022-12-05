package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",glue= {"stepdefinition"},
//plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true,
//monochrome=true,
plugin = {"pretty","html:target/HtmlReports.html"}
)
public class testrunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
