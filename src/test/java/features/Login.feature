Feature: Application Login

Scenario: Home page default login
Given User on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards are dispalay are "true"



Scenario: Home page default login
Given User on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards are dispalay are "false"
