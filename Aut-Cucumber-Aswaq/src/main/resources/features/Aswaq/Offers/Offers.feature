Feature: offers 

@smoke
Scenario: Place a free gift item using Visa payment 
	Given I am logged in ASWAQ 
	And adding a product with a free gift offer 
	When place an order with "VISA" payment 
	Then the order should be placed successfully 
	And the offer values should be displayed properly in All orders page 
	And the session is terminated 

Scenario: Place a BuyOneGetOne offer using Visa payment 
	Given I am logged in ASWAQ 
	And adding a product with Buy one get one offer 
	When place an order with "VISA" payment 
	Then the order should be placed successfully 
	And the offer values should be displayed properly in All orders page for BuyOneGetOne offer 
	And the session is terminated 

