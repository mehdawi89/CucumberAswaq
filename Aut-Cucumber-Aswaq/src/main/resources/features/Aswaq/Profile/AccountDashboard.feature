Feature: AccountDashboard 

Scenario: Verify the Account Dashboard displays successfully 

	Given I am logged in ASWAQ 
	When Navigating to Account dashboard 
	Then The Account Dashboard page is displayed properly 
	And the session is terminated 
	
	
Scenario: Verify navigating to profile from Account Dashboard 

	Given I am logged in ASWAQ 
	When Navigating to Account dashboard 
	And click on Profile Activated 
	Then My profile page should be displayed successfully 
	And the session is terminated 
	
Scenario: Verify navigating to Total Amount from Account Dashboard 

	Given I am logged in ASWAQ 
	When Navigating to Account dashboard 
	And click on Total Amount 
	Then the all orders page should be displayed 
	And the session is terminated
	
	
Scenario: Verify navigating to NumberOfOrders from Account Dashboard 

	Given I am logged in ASWAQ 
	When Navigating to Account dashboard 
	And click on Number of orders 
	Then the all orders page should be displayed 
	And the session is terminated  