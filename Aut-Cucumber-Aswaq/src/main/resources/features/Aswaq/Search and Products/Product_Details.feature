Feature: Product Details 

Scenario: Product Details Navigation 

	Given I am on ASWAQ home page 
	When Navigating to a product details page 
	Then The product details page should be displayed 
	And the session is terminated 
	
Scenario: Verify the ability of adding up to 3 in quantity for available products . 

	Given I am on ASWAQ home page 
	When Navigating to a product details page 
	And adding up to 3 in Quantity to cart 
	Then The product should be added successfully 
	And the session is terminated 
	
	
Scenario: Verify the "Notify me" button is displayed for Unavailable products for guest users 
	Given I am on ASWAQ home page 
	When navigating to an unavailable product details page 
	Then The product details page should be displayed 
	And The notify me button should be displayed for guest users 
	And the session is terminated 

@test	
Scenario: Verify the "Notify me" button is displayed for Unavailable products for Logged in users 
	Given i am a new User on Aswaq 
	When navigating to an unavailable product details page 
	Then The product details page should be displayed 
	And The notify me button should be displayed 
	And the session is terminated 
	
Scenario: Verify the ability to share product on Facebook 

	Given I am on ASWAQ home page 
	When Navigating to a product details page 
	And Share the product on facebook 
	Then The product should be shared on facebook successfully 
	And the session is terminated 
	
Scenario: Verify the ability to share product on Twitter 

	Given I am on ASWAQ home page 
	When Navigating to a product details page 
	And Share the product on Twitter 
	Then The product should be shared on facebook successfully 
	And the session is terminated 
