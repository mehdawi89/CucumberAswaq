Feature: Home Page 

Scenario: Recently Viewed 
	Given I am on ASWAQ home page 
	And Observe there is no Recently Viewed Section 
	When navigating to more than 5 product details page 
	Then the Recently view section should be displayed 
	And the session is terminated 
	
	
	@test
Scenario Outline: Subscribe to newsletter 
	Given I am on ASWAQ home page 
	When Entering an <email Address> in Subscribe section 
	And click on Subscribe button 
	Then the message <message> should be displayed 
	And the session is terminated 
	
	Examples: 
		|email Address                    |message                               |
		|mmehdawi+auto1@hajeer.com        |This email already exist ... thank you|
		|mmehdawi+auto1[random]@hajeer.com|Thank you for your subscription email |
		|mmehdawi+auto1                   |Enter valid email please              |
	

