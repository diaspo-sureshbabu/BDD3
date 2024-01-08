#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Page validation of saucedemo applicatoin  
  Scenario: Check whether user able to login with valid credentials
    Given when user at login page    
    When User enters valid "<username>" and "<password>" 
    And Click Login button    
    Then User navigate to Home page
    And close the browser
  
  Examples:
  | username                | password |
  | standard_user           | secret_sauce |
  
 
  
  
  