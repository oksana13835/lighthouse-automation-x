@apexz @smoke
Feature: ApexZ feature

  Background:
    Given open ApexZ web page

  Scenario: Open ApexZ web Page
    And navigate to home screen

  @apexz2 @smoke
  Scenario: Enable users
    Given open ApexZ web page
    And navigate to home screen
    Then click on Settings
    When click on Instrument
    And click on Options
    And click on User
    Then click on enable users
    And confirm popup window

  @apexz3 @smoke
  Scenario Outline: User Login
    Given open ApexZ web page
    When user type username and password for "<permission>"
    And click on Login button
    And navigate to home screen
    Examples:
      | permission  |
      | admin       |
      | operator    |
      | powerUser   |








