package com.aswaq.testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/Aswaq/Coupons.feature",

glue = "step_definitions")
public class CucumberJvmTest extends TestNGRunner {

}





