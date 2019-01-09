Feature: Checkout
	Scenario: Checkout a banana
		Given the price of a "banana" is 40c
		When I checkout 1 "banana"
		Then the total price should be 40c
		
	Scenario: Checkout two bananas
		Given the price of a "banana" is 40c
		When I checkout 2 "banana"
		Then the total price should be 80c