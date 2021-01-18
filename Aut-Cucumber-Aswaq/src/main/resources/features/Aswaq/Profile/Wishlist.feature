Feature: Wishlist 


Scenario Outline: Make sure wishlist is not enabled for Guest Users 
	Given I am on ASWAQ home page 
	When Navigating to a product details page 
	And Click on Add to wishlist 
	Then the message <message> should be displayed 
	And the session is terminated 
	
	Examples: 
		|message|
		|Please login to add products to a wish list.|
		
		
Scenario: Navigate to wishlist page from users menu 
	Given I am logged in ASWAQ 
	When navigating to wishlist page from Users menu 
	Then The wishlist page should be displayed 
	And the session is terminated 
	
	
Scenario: Navigate to wishlist page form slider menu 
	Given I am logged in ASWAQ 
	When navigating to wishlist from slider menu 
	Then The wishlist page should be displayed 
	And the session is terminated 
	
	
	
Scenario: Add a product to Wishlist 
	Given I am logged in ASWAQ 
	When Navigating to a product details page 
	And Add the Product to wishlsit 
	Then the item should be added to wishlist successfully 
	And the session is terminated 
	
Scenario Outline: Add a product to an empty Wishlist 
	Given I am logged in ASWAQ 
	When Navigating to a product details page 
	And add a product to wishlist with an empty wishlist name 
	Then the error <message> should displayed 
	And the session is terminated 
	Examples: 
		|message|
		|Wishlist name cannot be empty!|
		
Scenario Outline: Add a product that is already added to Wishlist 
	Given I am logged in ASWAQ 
	When Navigating to a product details page 
	And Add a Product to wishlsit that is already added 
	Then the error <message> should displayed 
	And the session is terminated 
	Examples: 
		|message|
		|Already added to this Wishlist|
		
Scenario: Add to Wishlist for available item from the quick view box 
	Given I am logged in ASWAQ 
	And searching for available product 
	When Navigate to quick view page for any item 
	And add item to wishlist 
	Then the item should be added to wishlist successfully 
	And the session is terminated 
	
	
Scenario: Add an unavailable product to Wishlist 

	Given I am logged in ASWAQ 
	When navigating to an unavailable product details page 
	And Add the Product to wishlsit 
	Then the item should be added to wishlist successfully 
	And the session is terminated 
	
	
Scenario: Wishlist page 
	Given I am logged in ASWAQ 
	When navigating to wishlist page from Users menu 
	And click on edit wishlist button 
	And Click on Remove item button 
	And Click on Remove wishlist button 
	Then the updates should apply successfully 
	And the session is terminated 
	
	
