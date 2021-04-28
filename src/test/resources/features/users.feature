Feature: Users Feature

  Background:
    Given open ApexZ web page

  @options @smoke
  Scenario: Enable users
    And navigate to home screen
    Then click on Settings
    When click on Instrument
    And click on Options
    And click on User
    Then click on enable users
    And confirm popup window

  @apexz3 @smoke
  Scenario Outline: User Login
    When user type username and password for "<permission>"
    And click on Login button
    And navigate to home screen
    Examples:
      | permission  |
      | admin       |
      | powerUser   |
 #     | operator    |


    Scenario: Disable Users
      When login as "Admin1" "pwd"
      And navigate to home screen
      Then click on Settings
      When click on Instrument
      And click on Options
      And click on User
      Then click on enable users
      And confirm popup window
