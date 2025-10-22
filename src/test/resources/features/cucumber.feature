Feature: Login functionality

 Scenario Outline: User Valid Login
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then user should see the Hotel homepage
Examples:
|username|password|
|karthikreddragon@gmail.com|Karthik@1994|