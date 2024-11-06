Feature: User Have To click The Forgotten Password link and pass some values
Background:
Given    User Have To Launch The Facebook Application Through Chrome Browser
And      User Have To Maximize The Window
Scenario: To validate the Login Functionality of valid Email Id
When     User Have To click forgotten password link
And      User Have To pass the values
         |emilid|devaagar914@gmail.com|
Then     User Have To close the browser
   
  