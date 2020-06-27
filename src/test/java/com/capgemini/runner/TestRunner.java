package com.capgemini.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"features"},glue= {"com.capgemini.stepDef"},
dryRun=false,
format= {"pretty","html:test_output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"}

		
		
		
		)
public class TestRunner {
	

}
