
Feature: Amazon Search

  Scenario: Search for Product

    Given User login to application
    When  Enter the product name as "Macbook Pro"
    Then Product name should display in results as "Macbook Pro"
