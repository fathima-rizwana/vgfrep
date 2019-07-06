Feature: search engine
Scenario: search for an item
Given user enters un and pwd
When user enters the name of item "head"
When user clicks on find details
Then verify search engine