Feature: Cash On Delivery 

@smoke
Scenario: Verify the ability to place order using COD when the cart total is less than 5000 
	Given I am logged in ASWAQ 
	When adding some items to cart with less than 5000 SR 
	And place an order with "COD" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
@smoke	
Scenario: Verify the ability to place order using COD when the cart total is more than 5000 
	Given I am logged in ASWAQ 
	When adding items to cart with more than 5000 SR 
	Then the COD option should not be available 
	And the session is terminated 
	

Scenario: Verify the ability to place order using COD when Adding a product is not allowed by COD 
	Given I am logged in ASWAQ 
	When add unallowed COD item to the cart 
	Then the COD option should not be available for unallowed COD products 
	And the session is terminated 

	
Scenario: Verify the ability to place order for prevented Users 
	Given that a user which can't use COD is logged to ASWAQ 
	When adding some items to cart with less than 5000 SR 
	Then the COD option should not be displayed 
	And the session is terminated