Feature: Profile 



Scenario: Navigate to profile from Top banner 
	Given I am logged in ASWAQ 
	When navigating to My Profile from Top banner 
	Then My profile page should be displayed successfully 
	And the session is terminated 
	
Scenario: Navigate to profile page from navigation menu 
	Given I am logged in ASWAQ 
	When navigating to my profile page from slider Menu 
	Then My profile page should be displayed successfully 
	And the session is terminated 
	
	
Scenario Outline: Edit info from profile page 
	Given I am logged in ASWAQ 
	And navigating to My Profile from Top banner 
	And navigating to Edit profile info 
	When updating the profile info firstname <Firstname> lastname<Lastname> and Idnumber<ID number> 
	And Click on save button 
	Then the profile should be updated successfully 
	And the session is terminated 
	
	Examples: 
		|Firstname|Lastname  |ID number|
		|Test     |Automation|007999981|
		
		
Scenario Outline: Change Password 
	Given I am logged in ASWAQ 
	And navigating to My Profile from Top banner 
	And navigating to change password page 
	When Entering New Password<New_password>New confirmation Password<New_Confirmation_password>and OldPassword<Old_Password> 
	And Click on save button 
	Then the message <message> should be displayed 
	And the session is terminated 
	
	Examples: 
		|New_password | New_Confirmation_password | Old_Password | message |
		| password1234| password1234              | password1234 |Password updated|
		| password123 | password1234              | password1234 |The two password fields didn't match.|  
		| password123 | password123               | passtest123  |Your old password was entered incorrectly. Please enter it again.|
	
		
Scenario: Verify Email with verifed User 
	Given I am logged in ASWAQ 
	When navigating to My Profile from Top banner 
	Then The verify button should not be displayed 
	And the session is terminated 
	
Scenario: Verify email with unverifed User 

	Given I am logged in ASWAQ with unverifed user 
	When navigating to My Profile from Top banner 
	Then The verify button should be displayed 
	And the session is terminated 
	
	
	
	
	
	