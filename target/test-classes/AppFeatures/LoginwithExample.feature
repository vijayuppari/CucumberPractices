Feature: Login to Application


 Scenario Outline: Login to Amazon App with different credentials
    Given Navigate to Amazon Videos "url"
    When Enter the username in "<username>" field
    And  Enter the password in "<password>" field
   When click on Login buttn
    Then user naviagtes to Home page

    Examples:
    |username|password|
    |vijay | admin|
    |naresh| admin12|
    |Sameer| admin113 |
