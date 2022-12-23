package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/login.feature"},glue = {"defination"},dryRun = false)

public class test_runner extends AbstractTestNGCucumberTests{

}
