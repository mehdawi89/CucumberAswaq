Feature: Retail Login API

Scenario: Login using Invalid username or password 
Given I want to execute post  request for  login
When using invalid username or password for login
Then statuc code 401 should appear


Scenario: Login to Aswaq
Given I want to execute post  request for  login
When using valid username and password for login
Then statuc code 200 should appear
