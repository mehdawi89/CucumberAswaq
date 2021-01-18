Feature:  Login Page
@smoke
Scenario Outline: Login with valid username / Password 
	Given I am on ASWAQ home page 
	When Login using valid Emailaddress<Emailaddress> and Password<Password> 
	Then the user should be logged in successfully 
	And the session is terminated 
	
	Examples: 
		|Emailaddress             |Password    |
		|mmehdawi+auto1@hajeer.com|password1234|
		
@smoke		
Scenario Outline: 	Verify that user is not able to login with invalid username and password  
	Given I am on ASWAQ home page 
	When Login using valid Emailaddress<Emailaddress> and Password<Password> 
	Then the error <message> should displayed 
	And the session is terminated 
	
	Examples: 
		|Emailaddress             |Password      |message                                                                                        | 
		|mmehdawiauto1@hajeer.com |password1234  |Please enter a correct email address and password. Note that both fields may be case-sensitive.|  
		|mmehdawi+auto1@hajeer.com|password123   |Please enter a correct email address and password. Note that both fields may be case-sensitive.|  
		|empty                    |empty         |This field is required.| 
		
@smoke	
Scenario Outline: Verify the ability to Login via Facebook 
	Given I am on ASWAQ home page 
	When Login with Facebook with valid <EmailAddress> and <Password> 
	Then the user should be logged in successfully 
	And the session is terminated 
	Examples: 
		|EmailAddress             |Password      |
		|mmehdawi+fb@hajeer.com   |password1234  |
		
@smoke	
Scenario Outline: Verify the ability to Login via Google 
	Given I am on ASWAQ home page 
	When Login with Google with valid <EmailAddress> and <Password> 
	Then the user should be logged in successfully 
	And the session is terminated 
	
	Examples: 
		|EmailAddress                  |Password      |
		|testautomation805@gmail.com   |hajeer123     |
		
		
@smoke		
Scenario Outline: Verify the ability to Login via Twitter 
	Given I am on ASWAQ home page 
	When Login with Twitter with valid <EmailAddress> and <Password> 
	Then the user should be logged in successfully 
	And the session is terminated 
	
	Examples: 
		|EmailAddress                  |Password      |
		| mmehdawi+twitter@hajeer.com  | password1234 |
		
		
@smoke		
Scenario: Verify the ability to logout from the site. 
	Given I am logged in ASWAQ 
	When logout from ASWAQ 
	Then the user should be logout successfully 
	And the session is terminated 
	
	

Scenario: Verify the forget password functionality for a registerd user 
	Given I am on ASWAQ home page 
	And I forget the password for my account 
	When Navigating to forget password page 
	And Enter Registered Email Address "mmehdawi+auto1@hajeer.com" 
	And Click on Send Reset Email 
	Then The Reset password email should be sent successfully 
	And the session is terminated 
	
	
Scenario Outline: Verify that an error message should displayed when entering an unregisterd email for forget password. 
	Given I am on ASWAQ home page 
	And I forget the password for my account 
	When Navigating to forget password page 
	And Enter UnRegistered Email Address "mmehdawi+asdfh@hajeer.com" 
	And Click on Send Reset Email 
	Then the error <message> should displayed 
	And the session is terminated 
	Examples: 
		|message                                                                |
		| We're sorry. We weren't able to identify you given the email provided.|
