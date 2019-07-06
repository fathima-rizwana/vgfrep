Feature: check cart
Scenario: User moves to cart without adding any item to it
Given Alex has registered into TestMeApp
When alex search for particular item like headphone
And try to proceed to payment without adding any item to cart
Then TestMeApp does not display cart icon
 