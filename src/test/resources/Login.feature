Feature: login into TestMeApp
Scenario Outline: login with valid credentials
Given click on signin 
When user enters uname "<uname> "
When user enters password "<password> "
And click on login
Then verify successful login

Examples:
|uname|password|
|lalitha|password123|
