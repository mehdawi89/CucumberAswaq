Feature: Search 


Scenario Outline: A pop up message should appear when user try to search for empty value. 
	Given I am on ASWAQ home page 
	When searching with empty value 
	Then the error <message> should displayed 
	And the session is terminated 
	Examples: 
		|message| 
		|Please type your search words!|
		
Scenario: Search by UPC 
	Given I am on ASWAQ home page 
	When searching for UPC "6281006442924" 
	Then The Search Results should be retrieved successfully 
	And the session is terminated 
	
	
Scenario: Market's search 
	Given I am on ASWAQ home page 
	When searching for White in the all markets 
	Then The returned results are from all markets 
	And the session is terminated 
	
	
Scenario: Sub market search 
	Given I am on ASWAQ home page 
	When searching for White in the mobiles sub market 
	Then The returned results are from mobiles sub market 
	And the session is terminated 
	
	
Scenario: verify Search filters are working 
	Given I am on ASWAQ home page 
	When searching for White in the all markets 
	And click on Necklaces from fashion 
	Then the filters should be applied properly 
	And the session is terminated 
	
	
Scenario: verify Clear all functionality after applying filters 
	Given I am on ASWAQ home page 
	When searching for White in the all markets 
	And click on Necklaces from fashion 
	And click on clear all 
	Then The returned results are from all markets 
	And the session is terminated 
	
Scenario: change the language under the search results page 
	Given I am on ASWAQ home page 
	When searching for White in the all markets 
	And change the language to Arabic 
	Then The returned results are from all markets in arabic 
	And the session is terminated 
	
	
Scenario: Search results page title 
	Given I am on ASWAQ home page 
	When searching for White in the all markets 
	Then the page title should be the same as the term 
	And the session is terminated 
	@test
Scenario: pagination
	Given I am on ASWAQ home page 
	When searching for White in the all markets 
	Then the page title should be the same as the term 
	And The page pagination should work properly 
	And the session is terminated
	
Scenario: Trending Search 
	Given I am on ASWAQ home page 
	When clicking on search bar 
	Then the suggested search terms should be displayed 
	And the session is terminated 
	
	
Scenario: Trending search for company users 
	Given I am logged with a company user 
	When clicking on search bar 
	Then the suggested search terms should be displayed 
	And the session is terminated 