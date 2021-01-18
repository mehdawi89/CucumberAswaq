Feature: Wholesale 


Scenario: The Credit Amount and Credit Transaction is displayed for wholesale Users 
	Given I am logged with a company user 
	When Navigating to Account Dashboard 
	Then The Credit Amount and Credit Transaction is displayed for wholesale Users 
	And the session is terminated 
	
Scenario: Place order with wholesale user 
	Given I am logged with a company user 
	When adding wholesale item to shopping cart 
	And place an order with "wallet" payment 
	Then the order should be placed successfully 
	And the session is terminated 
