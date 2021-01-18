package restapi;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;



public class HttpRequests {


	public String authorization = "x5RBdTbp+fk_jjzh7Y%UZKvkF5sa9M";
	public HttpClient client = HttpClientBuilder.create().build();
	public int statusCode;
	public StatusLine statusLine;
	public StatusLine responseBody;
	public HttpResponse response ;
	public String requestURL;
	
	public void getMethod(String url) throws  JSONException, ClientProtocolException, IOException{
		requestURL = url;
			
		HttpGet request = new HttpGet(url);
		printInfoBeforExecute("GET");
		
       // Set headers
		request.addHeader("Authorization", authorization );
        request.addHeader("content-type", "application/json");
        
        // Execute get request
         response = client.execute(request);
        
        // Return  the status code.
        statusCode = response.getStatusLine().getStatusCode();
        statusLine = response.getStatusLine();
        
 
        printInfoAfterExecute();
               
	}
	
	public void postMethod(String url, String requestBody)throws  JSONException, ClientProtocolException, IOException  {
		requestURL = url;
		 HttpPost request = new HttpPost(url);
		printInfoBeforExecute("POST");
		
		//Set headers
		 request.addHeader("Authorization", authorization );
	     request.addHeader("content-type", "application/json");
	     
	     StringEntity params =new StringEntity(requestBody);
	     request.setEntity(params);
	     
	     // Execute post  request
	     response = client.execute(request);

	     // Return  the status code.
	      statusCode = response.getStatusLine().getStatusCode();
	      statusLine = response.getStatusLine();
	      printInfoAfterExecute();
	      
	               
	}
	
	public void putMethod(String url, String requestBody)throws  JSONException, ClientProtocolException, IOException  {
		requestURL = url;
		
		 HttpPut request = new HttpPut(url);
		printInfoBeforExecute("PUT");
			
		//Set Headers	
		 request.addHeader("Authorization", authorization );
	     request.addHeader("content-type", "application/json");
	     
	     StringEntity params =new StringEntity(requestBody);
	     request.setEntity(params);
	     
	     // Execute put  request
	     response = client.execute(request);

	     // Return  the status code.
	        statusCode = response.getStatusLine().getStatusCode();
	        statusLine = response.getStatusLine();
	        
	        printInfoAfterExecute();
	     
		               
	               
	}
	
public void printInfoBeforExecute(String request) {
	System.out.println("************************************************");
	System.out.println("Http Request: " + request);
	System.out.println("Request url : " + requestURL);
	  
	
}

public void printInfoAfterExecute() {
	 System.out.println("Status Code : " + statusCode);
     System.out.println("Status Line  : " + statusLine);

     System.out.println("************************************************");
	
}
	
	
           

    
        
  

      
	
	
}
