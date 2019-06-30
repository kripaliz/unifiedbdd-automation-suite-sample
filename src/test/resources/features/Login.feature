@login
Feature: Features related to Login Page 

@signIn
Scenario Outline: Sign into Anuko Time Tracker 
	Given I visit Anuko Home Page 
	And I goto Login page
	When I login with "<username>" and "<password>" 
	And click on Login button 
	Then the username is displayed on the Time Tracker Home page 
	
	Examples:
		|username		 	|password				|
		|UnifiedBdd			|UnifiedBddAutomation	|