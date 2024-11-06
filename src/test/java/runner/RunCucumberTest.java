package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/features/LoanCalculatorEdge.feature", 
	glue = "stepDefinitions", 
	plugin = { 
        		"pretty",
        		"html:target/cucumber-reports.html",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
		}, 
        	dryRun = false,
        	monochrome = true,
        	publish = true
	)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() 
//    {
//        return super.scenarios();
//    }

}