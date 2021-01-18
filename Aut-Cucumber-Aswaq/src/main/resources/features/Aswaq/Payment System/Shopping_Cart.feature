Feature: Shopping Cart 


Scenario: Verify the Shopping Cart when empty 
	Given I am logged in ASWAQ 
	When navigating to shopping cart 
	Then The your cart is empty message and Continue shopping link should be displayed 
	And the session is terminated 

@smoke	
Scenario: Adjust quantities from shopping cart 
	Given I am logged in ASWAQ 
	When adding one item to cart 
	And Increase the quantity of the product to "2" 
	Then The quantity should be updated 
	And the session is terminated 

Scenario: Remove an item from shopping cart 
	Given I am logged in ASWAQ 
	When navigating to shopping cart 
	And Click on Remove button 
	Then The item should be removed successfully 
	And the session is terminated 
	
	
Scenario: Adding Items to Shopping Cart for Guest User 
	Given I am on ASWAQ home page 
	When adding items to the shopping cart 
	And navigating to shopping cart 
	And proceed to checkout 
	Then website should redirect user to login page 
	And should get back to shopping cart when logged in successfully 
	And the session is terminated 
	
@smoke
Scenario: Remove multiple items from shopping cart 
	Given I am logged in ASWAQ 
	When adding items to the shopping cart 
	When navigating to shopping cart 
	And select more than an item from shopping cart 
	And click on Delete button 
	Then The item should be removed successfully 
	And the session is terminated 
	