Feature: Register Action

  Scenario: Sucessful Register with Valid Data
    Given User is on Home Page
    When User Navigate to Register Page
    When User enters Account Details
    And User enters Personal Details
    And User enters Address
    And Agree the Terms
    Then Message displayed Register Successfully
