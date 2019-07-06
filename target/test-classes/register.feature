Feature: register to TestMe app
Scenario: register with valid details
Given opens TestMeApp
When the user clicks on signup page
When user enters username as "ffrriiiizzwana" 
When user enters firstname as "fathima" 
When user enters lastname as "rizwana"
When user enters password as "frizwana"
When user enters confirm password as "frizwana"
When user clicks on gender as female
When user enters email as "frizwana@gmail.com"
When user enters mobile number as "7654321890"
When user enters DOB as "11/02/1998"
When user enters address as "chennai"
When user selects security  question
When user enters Answer as "chennai"
And user clicks on register button
Then verify registration success