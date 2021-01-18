Feature: Odoo 

@test
Scenario: place an order and check the values on Odoo 
	Given I am logged in ASWAQ 
	And adding a product with a free gift offer 
	And place an order with "VISA" payment 
	When Navigate to Odoo Staging 
	And Search for Aswaq order number 
	Then All the Order values should displayed properly in Odoo 
	And All the Order values should displayed properly in All Order page 
	And the session is terminated 
	
@smoke
Scenario: Return item 
	Given I am logged in ASWAQ 
	And adding one item to cart for return
	And place an order with "VISA" payment 
	When Navigate to Odoo Staging 
	And Complete the placed order 
	And Navigating to All orders page 
	And search for the placed order 
	Then The Placed order values should displayed properly in All orders page 
	And the order can be returned successfully 
	And the session is terminated 