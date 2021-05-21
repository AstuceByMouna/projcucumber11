Feature: application login 

@smoketest
Scenario: Home page login NOK
	Given I visit login page
	When I enter "xxx" in the user name field and "yyyy" in the passsword field
	And I press the access button
	Then I should see an error message
	And user is connected "false"