Feature:User must be able to add the product to the cart 

@Sanity
Scenario Outline: User enter into the website and search the product and add it to the cart see the logout 

Given User click the login button and enter the user name "<username>"
And User enter the passwords "<password>"
And User clciks the login button 
And User should able to see the logout button 
And  User enter the product "<book>" in the search box 
And Click the search button 
When  user click the add to cart button 
And user check the shopping cart number 
And User click the shopping cart and clicks the product check box 
And Clear the Shopping cart 
When User click the logout button 
Then User able to see the login button 

Examples:
|username|password|book|
|santhiya.tester26@gmail.com|Lisa@270397|Computing and Internet|
|santhiya.tester27@gmail.com|Lisa@270397|Health Book|
