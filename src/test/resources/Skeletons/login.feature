Feature: devopsintegration
  Scenario: login functionality
    Given the driver is launched  
    And navigated the URL
    When user enters the username 
    And enters password
    And click on the logins
    Then validate the login is successful
 