Feature: Register Action

Scenario Outline: Sucessful Register with Valid Data
	Given User is on Home Page
	When User Navigate to Register Page
#	When User enters Data to Register
	And User enters "<username>" and "<password>"
	Then Message displayed Register Successfully
	When User LogOut from the Application
	Then Message displayed LogOut Sucessfully
	
Examples:
	|	username	|	password	|
	|	celsoeron	|	Test1234	|	
	|	test02	  |	Test1234	|	
