Feature: ATM Card feature
  User should be asked for the PIN once ATM card is inserted into ATM.
  User should be given warning message if PIN number entered is wrong.
  User should be authenticated successfully if PIN number entered is correct.

  Scenario: I enter the correct PIN at ATM machine
    Given I inserted the ATM card in the cash machine
    And I am asked to enter the PIN
    When I enter the correct PIN
    Then I should be able to see the option of money withdrawal
    Then I withdraw the money

  Scenario: I enter the incorrect PIN at ATM machine
    Given I inserted the ATM card in the cash machine
    And I am asked to enter the PIN
    When I enter the incorrect PIN
    Then I should not be able to see the option of money withdrawal