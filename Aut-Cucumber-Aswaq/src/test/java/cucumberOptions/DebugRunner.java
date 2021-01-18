package cucumberOptions;





import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Uncomment @RunWith if u are using JunitTest

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/Aswaq/Test Suites",

		glue = "step_definitions"

)

public class DebugRunner extends TestNGRunner {

}




