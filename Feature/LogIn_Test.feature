Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username | Password |
    	| CelsoEron | Test1234 |
    Then Message displayed Login Successfully
    
Scenario: Sucessful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Sucessfully