Feature: Application Login


Scenario: Home page Default login 
Given User is on Login page 
When User Login into Application with "swetha" and password "123456"
Then Home page is populated
And Cards are displayed