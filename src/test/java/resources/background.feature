Feature: Run Selenium Scenarios

  Background: This is a simple background
    Given I am on the home page of softpost

  Scenario: Check the title of softpost.org
    Then I should see that title contains "tutorials" phrase

  Scenario: Check the source of softpost.org
    Then I should see that source contains "tutorials" phrase