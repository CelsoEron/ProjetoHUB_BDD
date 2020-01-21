Feature: Register Action

  Scenario: Sucessful Register with Valid Data
    Given User is on Home Page
    When User Navigate to Register Page
    And User enters Account Details
    And User enters Personal Details
    And User enters Address
    And Click in agree terms and Register button
    Then Message displayed Register Successfully
    
  Scenario: Failed Register with Invalid Data
    Given User is on Home Page
    When User Navigate to Register Page
    And User enters invalid Account Details
    And User enters Personal Details
    And User enters Address
    And Click in agree terms and Register button
    Then Message displayed Register Failed
