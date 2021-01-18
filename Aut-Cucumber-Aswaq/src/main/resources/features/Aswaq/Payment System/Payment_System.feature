Feature: Payment System 

@smoke
Scenario: Place Master Card payment 
	Given I am logged in ASWAQ 
	When adding one item to cart 
	And place an order with "master" payment 
	Then the order should be placed successfully 
	And the session is terminated 
@smoke	
Scenario: Place Mada payment 
	Given I am logged in ASWAQ 
	When adding one item to cart 
	And place an order with "MADA" payment 
	Then the order should be placed successfully 
	And the session is terminated 
@smoke	
Scenario: Place Visa payment 
	Given I am logged in ASWAQ 
	When adding one item to cart 
	And place an order with "VISA" payment 
	Then the order should be placed successfully 
	And the session is terminated 
@smoke	
Scenario: Place Cash on Delivery  payment 
	Given I am logged in ASWAQ 
	When adding one item to cart 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	

Scenario: Cancel Order 
	Given I am logged in ASWAQ 
	And Navigating to All orders page 
	When Navigating to order details page 
	And Cancelling the order 
	Then the order should be cancelled successfully 
	And the session is terminated 
	
	
	
	
	
