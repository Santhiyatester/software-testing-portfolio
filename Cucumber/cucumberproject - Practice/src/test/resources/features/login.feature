Feature: User must be able to see the dashboard

@Regression
Scenario Outline: User should be able to get into website
  Given User enters the username "<username>"
  And User enters the password "<password>"
  When User clicks the submit button
  Then User should see the dashboard
  
Examples: 
|username|password|
|student|Password123|
  
  @Smoke
  Scenario Outline: User should not be able to get into website
  
  Given User enters the username "<username>"
  And User enters the password "<password>"
  When User clicks the submit button
  But User should not see the dashboard
  
Examples: 
|username|password|
|student|password123|
|Student|password123|
|Student|password123|