Feature: Campaign 


Scenario Outline: Registration new Participant 
	Given I am on Ramadan campaign Landing page 
	When Register a new campaign participant Name<Name>and MobileNumber<MobileNumber> 
	Then the confirmation message<Message>should be displayed 
	And the session is terminated 
	Examples: 
		|Name             |MobileNumber|Message                        |
		|Test             |00962797265 |Thank you for your registration|
		
		
		
Scenario Outline: Register already added participant 
	Given I am on Ramadan campaign Landing page 
	When Register an already added campaign participant 
	Then the error <message> should displayed 
	And the session is terminated 
	Examples: 
		|message                         |	
		|* Mobile Number is already exist|			
		
		
Scenario Outline: Register using Invalid data in campaign 
	Given I am on Ramadan campaign Landing page 
	When Register a new campaign participant Name<Name>and MobileNumber<MobileNumber> 
	Then the error <message> should displayed 
	And the session is terminated 
	
	Examples: 
		|Name             |MobileNumber|message                          |
		|empty            |empty       |* Mobile Number field is required|
		|Test             |empty       |* Mobile Number field is required|
		|empty            |00962797265 |* Name field is required         |
		
		
Scenario Outline: Navigate to unactive Campaign 
	Given I am on ASWAQ home page 
	When navigating to unactive campaign 
	Then the error <message> should displayed 
	And the session is terminated 
	
	Examples: 
		|message                                    |	
		|This draw page is currently not available. |
