package cucumberOptions;

import org.testng.annotations.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Uncomment @RunWith if u are using JunitTest

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/Aswaq/Offers/Coupons.feature",tags= {"@test"} ,

		glue = "step_definitions"

)

@Test
public class TestRunner extends TestNGRunner {
	

}
