Feature: Quick view 


Scenario: Quick view is available for all items under the search result page 
	Given I am on ASWAQ home page 
	When searching for available product 
	And Navigate to quick view page for any item 
	Then The quick view page should be displayed 
	And the session is terminated 
	
	
Scenario: Add to cart and update QTY from the quick view box 
	Given I am on ASWAQ home page 
	And searching for available product 
	And Navigate to quick view page for any item 
	When adding one item to cart from Quickview 
	Then the item should be added to the shopping cart 
	And the session is terminated 

	
Scenario: 
	Clicking on view full details button from the quick view box should lead to item description page 
	Given I am on ASWAQ home page 
	And searching for available product 
	When Navigate to quick view page for any item 
	And click on view full product details 
	Then The product details page should be displayed 
	And the session is terminated 
	
Scenario: Notify me from quick view box 
	Given I am on ASWAQ home page 
	And searching for unavailable product 
	When Navigate to quick view page for unavailable item 
	Then notify me button should be displayed 
	And the session is terminated 