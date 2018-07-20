Feature: Web table automation test
Description: As a user I want to test web table and find out various information about different club

Scenario: Get name of club list and number from webtable

Given User open chrome browser
And User lunch the premier league home page
When User grab all club name and findout total number of club User show all club name on the console  
Then Validate Chelsea is there or not
And User find out the chelsea club position
And Validate Chelsea position is 6 or not