Feature:search and place order the products
 @arun
Scenario Outline: search experiance in both homepage and offerspage
Given user is on landing page
When  user search with shortname <Name> in homepage and extract the acutal product name 
Then user search with shortname <Name> in offerspage
And validate product name in offerspage is matching with homepage
Examples:
|Name|
|Tom |
|beet|