Feature: create an Employee and Get Employee Details
Scenario: create a New Employee and get The details
Given Launch The Browser
When Enter UserName
When Enter Password
Then Click On Login Button
Then Verify user landed on DashboardPage
When Click On PIM Menu
And Click On Add Employee Button
And Enter required Detalis
Then Click On Save Button
When Click On Employee List 
Then Search for Created User
Then Verify the Results