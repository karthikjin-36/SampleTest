package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(glue="com.stepDefinition",features="src\\test\\resources\\features\\cucumber.feature")
	public class runnerTest {
}
