Feature: Register Action

Scenario: Sucessful Register with Valid Data
	Given User is on Home Page
	When User Navigate to Register Page
	And User enters Data to Register Page
	| Username | Password |
    	| CelsoEron | Test1234 |
    Then Message displayed Register Successfully
    
