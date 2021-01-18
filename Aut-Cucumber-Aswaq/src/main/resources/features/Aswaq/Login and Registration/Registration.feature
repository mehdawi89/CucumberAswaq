Feature: Registration 

@smoke
Scenario: Make sure that registration form is submitting through secure connection 
	Given I am on ASWAQ home page 
	When Navigate to Aswaq Registration page 
	Then Registration page should be through secure connection 
	And the session is terminated 

@smoke	
Scenario Outline: Register (User Account Type) using valid information : 
	Given I am on ASWAQ home page 
	When Navigate to Aswaq Registration page 
	And register a new user <email_address> <password1> <password2> 
	Then The user should be registered successfully 
	And the session is terminated 
	
	Examples: 
		|email_address                      |password1    |password2   |
		|mmehdawi+newauto[random]@hajeer.com|password1234 |password1234|
		
		
@smoke		
Scenario Outline: Register (Company) using valid information : 
	Given I am on ASWAQ home page 
	When Navigate to Aswaq Company Registration page 
	And register a new user <email_address> <password1> <password2> 
	Then The user should be registered successfully 
	And the session is terminated 
	
	Examples: 
		|email_address                      |password1    |password2   |
		|mmehdawi+comanyauto[random]@hajeer.com|password1234 |password1234|
		
@smoke		
Scenario Outline: Register using invalid data 
	Given I am on ASWAQ home page 
	When Navigate to Aswaq Registration page 
	And register a new user <email_address> <password1> <password2> 
	Then the error <message> should displayed 
	And the session is terminated 
	
	Examples: 
		| email_address       | password1 | password2 | message                                               | 
		| sradwan+5@aswaq.com | whatever  | whatever  |A user with that email address already exists          |  
		|            empty    | whatever  | whatever  |This field is required                                 |  
		| sradwan+n@aswaq.com |  empty    | whatever  |This field is required                                 |  
		| sradwan+n4@aswaq.com| whatever  |    empty  |This field is required.                                |  
		| sradwan+n2@aswaq.com| whatever  | whatever1 |The two password fields didn't match                   |  
		| sradwan+n5@aswaq.com| 12345     | 12345     |Ensure this value has at least 6 characters (it has 5).|  
		| sradwan+n4@aswaq.com| qwerty    | qwerty    |Please choose a less common password                   | 