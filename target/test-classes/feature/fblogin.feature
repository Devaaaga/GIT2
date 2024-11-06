Feature: To Validate the 	Login functionality of FaceBook Application
Background:
Given User Have To Launch The Facebook Application Through Chrome Browser
And   User Have To Maximize The Window
Scenario: To Validate the Login functionality with valid Username and Invalid pwd
When  User Have To Enter The valid username and Invalid password

|username|SmartskillTechnologies123@gmail.com|
|password|sstech@123|
And   User Have To Click The Loginbutton
Then  User Have To Close The Browser
Scenario: To Validate the Login functionality with Invalid Username and Invalid pwd
When  User Have To Enter The Invalid Username and Invalid password
|username|password|
|HCL123@gmail.com|HCL@123|
And   User Have To Click The Loginbutton
Then  User Have To Close The Browser
Scenario:  To Validate the Login functionality with Invalid Username and valid pwd
When  User Have To Enter The Invalid Username and valid PaSSword
|username|password|
|sathish123@gmail.com|sathish@123|
And User Have To click The Loginbutton  
Then User Have To Close The Browser

