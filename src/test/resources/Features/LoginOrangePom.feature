Feature:orangeLogin
Scenario:orangeLoginFunctionality

Given setBrowser
When enterUserName
When enterPassword
Then clickLogin
And clickOnPIM
Then clickOnAddEmployee
And addNewEmpDetails
Then clickOnEmployeeList
Then Seach created user

