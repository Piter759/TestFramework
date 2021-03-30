Feature: Run Selenium scenarios

    Scenario: Check the title of the website - softpost
      Given I verify the website titles as mentioned below
        | website | http://www.softpost.org |
        | title   | tutorial                |
