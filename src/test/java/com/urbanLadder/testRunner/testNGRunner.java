package com.urbanLadder.testRunner;
//import org.junit.runner.RunWith;

import org.testng.annotations.Test;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/featureFiles/"}, 
		glue = "com.urbanLadder.stepDefinitions", 
		plugin = {"pretty","html:reports/report.html","rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false,
		monochrome=false
		
		)

@Test
public class testNGRunner extends AbstractTestNGCucumberTests{

}
