Feature:Place order the products
 @logesh
Scenario Outline: search experiance in both homepage and checkout page
Given user is on landing page
When  user search with shortname <name> in homepage and extract the acutal product name
And Added  "3" items to selected product to cart
Then User procceds to checkout
And verify user has ability to entry promo code and place the order 

Examples:
|name|
|Tom |