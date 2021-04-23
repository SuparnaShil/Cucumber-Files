  Feature: Application Login  
  Scenario: Homepage default login
  
  Given User is on Netbanking landing page
  When user login into application with username and password
  Then homepage is populated
  And cards are displayed  