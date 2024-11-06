Feature: User Have to Validate the login functionality
Background:
Given     User Have To Launch The Facebook Application Through Chrome Browser
And       User Have To Maximize The Window
Scenario: To Validate the Login Functionality Of the Invalid Username and Invalid Password
When  User Have To pass the Invalid Username and Invalid Password
          |username|password|
          |samrtskilltechnologies@gmail.com|sstech@123|
          |capgeamini@gmail.com|cap@123|
          |infosys123@gmail.com|info@123|
And   User Have To Click The Login button
Then  User Have To Close The Chrome Browser
@regression
Scenario: To Validate the Login Functionality  Of The Invalid Username and Valid Password
When  User Have To pass The Invalid Username and valid Password
     |username|smartskillstechnologies123@gmail.com|
     |password|sstech@123|
And User Have To Click The Login button
Then User Have To Close The Chrome Browser
@sanity
Scenario: To Validate the Login Functionality Of The Valid Username and Valid Password
When   User Have To pass the valid Username  and valid Password
      |username|password|
      |smartskills@gmail.com|smart@123|
      |HCL123@gmail.com|hcl@123|
      |capgemini123@gmail.com|cap@123|
And   User Have To Click the Login button
Then  User Have To Close the Chrome Browser

