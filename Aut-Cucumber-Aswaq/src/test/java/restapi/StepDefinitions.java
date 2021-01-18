package restapi;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinitions {
	AswaqApi api = new AswaqApi();
	@Given("^I want to execute post  request for  login$")
	public void  login() throws JSONException, ClientProtocolException, IOException  {
		api.LoginAPI();
		
	}

@When("^using invalid username or password for login$")
public void invalid_username_and_password_retail_login() throws JSONException, ClientProtocolException, IOException {
	api.invalid_login();
	
}
	@Then("^statuc code (\\d+) should appear$")
	public void statuc_code_should_appear(int code)  {
		assertEquals(api.statusCode,code);
	  
	}

}
