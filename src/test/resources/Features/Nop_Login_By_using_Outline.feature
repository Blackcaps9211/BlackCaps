Feature: nop_Login_By_outline
Scenario Outline: Functionality for Nop_login

Given launch The N_browser
When enter values of "<UserName>" and "<Password>"
Then click On Submit

Examples:  | UserName| Password|

          |admin@yourstore.com|admin|
          
          |veeru@yourstore.com|veeru|
          
          |anji@yourstore.com|anjik|