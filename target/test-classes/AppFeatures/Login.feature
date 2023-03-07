@All
Feature: Login to Application

  @Fresh
  Scenario: Login to Amazon Fresh
    Given Navigate to Amazon Fresh "url"
    When Add the items to Fresh cart
    Then Complete the Payment

    @Prime
  Scenario: Login to Amazon Prime
    Given Navigate to Amazon Prime "url"
    When Add the movies to Prime cart
    Then Complete the Payments
  @Pay
  Scenario: Login to Amazon Pay
    Given Navigate to Amazon Pay "url"
    When Add the amount to amazon pay
    Then Complete the repayment
