package restapi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

public class AswaqApi extends HttpRequests {
	Properties prop;
	String requestUrl ;
	String requestBody="";
	public String hosturl = "https://staging.aswaq.com/en/api";
	  public void LoginAPI() throws IOException {
		  
		  InputStream input = new FileInputStream(".//AswaqAPI/login/login.properties");
	        prop  = new Properties();
             prop.load(input);

	        
	    
		  requestUrl = hosturl + prop.getProperty("url");
	  }
	  

	
	public void invalid_login() throws JSONException, ClientProtocolException, IOException {
		
		requestBody = prop.getProperty("invalid-request-body");
		postMethod(requestUrl, requestBody);
			
		
	}

}
