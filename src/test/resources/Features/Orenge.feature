Feature:orangeHRM
Scenario:orangeHrmFunctionality

Given lunchTheBrowser
When enterUsername
When enterValidPassword
Then clickOnLogin
Then verifyLoginSuccess or not
Then clickOnLogout
Then verify Logout Successfull or Not
Then clickOnLoginButton
And clickOnPIM
