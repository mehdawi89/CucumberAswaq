package com.aswaq.testing;

import org.testng.annotations.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Uncomment @RunWith if u are using JunitTest

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/Aswaq/", 


		glue = "step_definitions",
				tags = {"@smoke"}

)

@Test
public class SmokeTest extends TestNGRunner {

}
