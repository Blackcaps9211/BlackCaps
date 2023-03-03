Feature: Create and Search an Employee
Scenario: Create a New Employee and get the created Employee Details

Given launch the Browser
When enter UserName
When enter Password
Then click On Login
Then verify User Landed On Dashboard Page
When click On PIM Menu
And click On Add Employee Button
And fill The Required details
And click On Create Login Details Checkbox
Then fill Required User Details
Then click On Save Button
Then click On EmployeeList
Then search For Created User
Then verify The Results Of Created User