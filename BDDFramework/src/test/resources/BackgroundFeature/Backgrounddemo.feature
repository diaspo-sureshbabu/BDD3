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
@tag
Feature: verifying the Background functionality
  I want to use this template for my feature file
 	
 	
 	Background: common steps
		Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action


  @tag1
  Scenario: Title of your scenario 1
        
    Then first validate the outcomes
    And check more outcomes1

  @tag2
  Scenario Outline: Title of your scenario 2e
    
    Then second validation
    And check more outcomes2
    
    