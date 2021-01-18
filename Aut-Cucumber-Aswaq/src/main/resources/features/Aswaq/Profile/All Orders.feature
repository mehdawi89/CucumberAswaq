Feature: All Orders 

Scenario: All Orders Page 
	Given I am logged in ASWAQ 
	When Navigating to All orders page 
	Then the all orders page should be displayed 
	And the session is terminated 
	
Scenario: Search for all orders in specific dates 
	Given I am logged in ASWAQ 
	When Navigating to All orders page 
	And Search for orders by providing dates 
	Then the all orders page should be displayed 
	And the session is terminated 
	
	
Scenario: Search for specific Order by providing order number 
	Given I am logged in ASWAQ 
	When Navigating to All orders page 
	And search for order number "836687" 
	Then the selected order should be displayed 
	And the session is terminated 
	
	
