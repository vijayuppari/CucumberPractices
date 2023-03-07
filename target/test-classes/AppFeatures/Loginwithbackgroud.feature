@All
Feature: Login to Application

  Background: Login to Main Apps
    Given Navigate to Amazon Fresh "url"


  @Fresh
  Scenario: Login to Amazon Fresh
    When Add the items to Fresh cart
    Then Complete the Payment

    @Prime
  Scenario: Login to Amazon Prime
    When Add the movies to Prime cart
    Then Complete the Payments
  @Pay
  Scenario: Login to Amazon Pay
    When Add the amount to amazon pay
    Then Complete the repayment
