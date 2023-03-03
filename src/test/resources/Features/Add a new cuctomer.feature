Feature: Automate Add new customer
Scenario: Add a new customer in customers functionality
Given Setup the browser
When Enter valid username and password
When click on login
Then verify Login successfull or not
When click on the customers module
And click on the customers functionality
Then verify the customers page is loaded or not
When click on AddNew button
Then verify the Add new cuctomer page isloaded or not
When Enter the customer info
And click on save button
Then verify New customer Added or not