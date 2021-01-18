Feature: Coupons 

@smoke
Scenario Outline: add an undiscountable item to cart 
    
    
	Given I am logged in ASWAQ 
	When adding an undiscountable item to cart 
	And proceed to checkout payment page 
	And applying the coupon code <coupon> 
	Then the message <message> should be displayed 
	And the session is terminated 
	
	Examples: 
		|coupon|message|
		|aut02 | Your cart does not qualify for a coupon discount|
@smoke		
Scenario Outline: Display messages 

	Given I am logged in ASWAQ 
	When adding one item to cart 
	And proceed to checkout payment page 
	And applying the coupon code <coupon> 
	Then the message <message> should be displayed 
	And the session is terminated 
	
	Examples: 
		|coupon|message|
		|exp   | The 'Expired' coupon has expired|
		|invalid| No coupon found with code 'INVALID'|
		|aut02| Coupon 'Automation02- (Please do not edit or delete)' added to cart|
		
@smoke		
Scenario Outline: Remove a coupon from your cart 

	Given I am logged in ASWAQ 
	When navigating to shopping cart 
	And proceed to checkout payment page 
	And click on Remove Coupon 
	Then the message <message> should be displayed 
	And the session is terminated 
	
	Examples: 
		|message|
		|Coupon 'Automation02- (Please do not edit or delete)' removed from basket|
		
@smoke		
Scenario Outline: Place order with multiple fixed Coupon 

	Given I am logged in ASWAQ 
	And navigating to shopping cart 
	And proceed to checkout payment page 
	When applying the coupon code <coupon> 
	And the order total updated successfully for fixed Coupons 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	Examples: 
		|coupon|
		|aut02|
		
Scenario Outline: Place order with multiple Percentage Coupon 

	Given I am logged in ASWAQ 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code <coupon> 
	And the order total updated successfully for percentage coupons 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	Examples: 
		|coupon|
		|aut#|
		
		
Scenario Outline: Place order with multiple Percentage Coupon with max limit 

	Given I am logged in ASWAQ 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code <coupon> 
	And the order total updated successfully for percentage coupons with max limit 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	Examples: 
		|coupon|
		|aut%|
		

Scenario Outline: Place order with Once Per Customer percentage Coupon 

	Given i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code <coupon> 
	And the order total updated successfully for Once per customer percentage Coupon 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	Examples: 
		|coupon|
		|ONCEPERCUSTOMER%|
		
		
Scenario Outline: Place order with Once Per Customer percentage Coupon with max limit

	Given i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code <coupon> 
	And the order total updated successfully for Once per customer percentage Coupon with max limit 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	Examples: 
		|coupon|
		|ONCEPERCUSMAX%|
		
		
Scenario Outline: Place order with Once Per Customer Fixed Coupon 

	Given i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code <coupon> 
	And the order total updated successfully for Once per customer Fixed Coupon 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	Examples: 
		|coupon|
		|OncePerCusFix|
		
		
Scenario: Place order with Once by one customer Percentage Coupon 

	Given new Once by One "OnceByone%" Coupon has been created 
	And i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code 
	And the order total updated successfully for Once by one customer Percentage Coupon 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	
	
	
Scenario: Place order with Once by one customer Percentage Coupon with max limit 

	Given new Once by One "OnceByone%max" Coupon has been created 
	And i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code 
	And the order total updated successfully for Once by one customer Percentage Coupon with max limit 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	
	
	
Scenario: Place order with Once by one customer Fixed Coupon 

	Given new Once by One "OnceByoneFix" Coupon has been created 
	And i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	When applying the coupon code 
	And the order total updated successfully for Once by one customer fixed 
	And place an order with "cod" payment 
	Then the order should be placed successfully 
	And the session is terminated 
	

Scenario: Add an expired Coupon to the shopping cart

    Given new Once by One "OnceByoneFix" Coupon has been created 
    And i am a new User on Aswaq 
	And adding one item to cart 
	And proceed to checkout payment page 
	And applying the coupon code 
	When Changing the Coupon dates to expired 
	And navigating to shopping cart 
	Then The expired Coupon code should be removed 
	And the session is terminated 
	
	

		
		
		