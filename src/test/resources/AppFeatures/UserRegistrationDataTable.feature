Feature: User Registration

  Background: Navigation
    Given User navigated to the Registration Form
    Then User successfully form completed

  Scenario:  User Regsitration for Vijay
    When  User filled the form with below details
       |Vijay|Uppari|vijay@gmail.com|Hyderabad|
       |Naresh|Mandula|Naresh@gmail.com|Banglore|
       |Sravani|Alli|sravani@gmail.com|USA|


  Scenario:  User Regsitration NRI employee

    When  User filled the form with below details with columns
      |FirstName|LastName|Email|City|
      |Vijay|Uppari|vijay@gmail.com|Hyderabad|
      |Naresh|Mandula|Naresh@gmail.com|Banglore|
      |Sravani|Alli|sravani@gmail.com|USA|

