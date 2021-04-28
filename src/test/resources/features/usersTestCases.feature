Feature: Users Test Cases

  Background:
    Given open ApexZ web page
    And navigate to home screen
    Then click on Settings
    And click on Users

  Scenario: Default Users Tab

    And verify Users screen was displayed with Permission Level and User Name tables
    When I verify 4 of 10 permission levels present: Administrator, Power User,Operator, Unassigned
    And verify Delete, Edit and Add new Permission Level buttons present
    Then verify "No Users Added" message is displayed inside the User name table
    And verify Delete, Edit and Add new User buttons present

  Scenario: Default Administrator Permission level
    When I click on Administrator, Permission Level was highlighted in BLUE
    And Edit button was enabled
    And Delete button stayed disabled
    Then I click on Edit button
    And verify header of the screen as "Administrator"
    And verify Close and Save buttons
    Then click on Close button and verify users screen displayed
    Then I click on Edit button
    And verify four tabs present Main Screen, Data Record Screen, Data Report Screen and Setting Screen
    And verify Permission, Users, Priority and Name tabs
    And verify Permissions and Users tab are enabled
    And verify Priority and Name tab are disabled

    And verify StartStop is enabled and not editable
    And verify Data Record Screen is enabled and not editable
    And verify Data Report Screen is enabled and not editable
    And verify Setting Screen is enabled and not editable

    Then go to Data Record Screen
    And verify Filter Data Records is enabled and not editable
    And verify Delete All Data Records is enabled and not editable
    And verify Add Tag is enabled and not editable
    And verify Add Report is enabled and not editable
    And verify Export Data Records is enabled and not editable
    And verify USB is enabled and not editable
    And verify Print is enabled and not editable
    And verify CIFS is enabled and not editable
    And verify Network Printer is enabled and not editable

    Then go to Data Report Screen
    And verify Filter Data Reports is enabled and not editable
    And verify Delete All Data Reports is enabled and not editable
    And verify Delete Data Report is enabled and not editable
    And verify Export Data Reports is enabled and not editable
    And verify USB for Reports is enabled and not editable
    And verify Print for Reports is enabled and not editable
    And verify CIFS for Reports is enabled and not editable
    And verify Network Printer for Reports is enabled and not editable
    And verify Filter Audit Trails is enabled and not editable
    And verify Export Audit Trails is enabled and not editable
    And verify USB for Audit Trail is enabled and not editable
    And verify CIFS for Audit Trail is enabled and not editable
    And verify Set Audit Trail Comments is enabled and not editable

    Then go to Setting Screen
    And verify Sample Parameters is enabled and not editable
    And verify Locations is listed under Sample Parameters
    And verify Presets is listed under Sample Parameters
    And verify Sample Plans is listed under Sample Parameters
    And verify Certifications is listed under Sample Parameters
    And verify Users is enabled and not editable
    And verify Connectivity suboption is listed
    And verify Ethernet_WiFi is enabled and not editable
    And verify AD_LDAP_CIFS_Network Printer_3rd Party API is enabled and not editable
    And verify under Instrument Time is enabled and not editable
    And verify Audio_Visual is enabled and not editable
    And verify Options is enabled and not editable
    And verify Output is enabled and not editable
    And verify Configuration is enabled and not editable
    And verify Service is enabled and not editable

    Then go to Users tab
    And verify no users added
    And "No User selected" message is displayed inside the "Assigned Users" table
    Then click on Close button and verify users screen displayed

  Scenario: Default Power User Permission level
    When I click on Power User, Permission Level was highlighted in BLUE
    And Edit button was enabled
    And Delete button was enable
    Then I click on Edit button
    And verify header of the screen as "Power User"
    And verify Close and Save buttons
    Then click on Close button and verify users screen displayed
    Then I click on Edit button
    And verify four tabs present Main Screen, Data Record Screen, Data Report Screen and Setting Screen
    And verify Permission, Users, Priority and Name tabs
    And verify Permissions and Users tab are enabled
    And verify Priority and Name tab are enabled

    And verify StartStop is enabled and editable
    And verify Data Record Screen is enabled and editable
    And verify Data Report Screen is enabled and editable
    And verify Setting Screen is enabled and editable

    Then go to Data Record Screen
    And verify Filter Data Records is enabled and editable
    And verify Delete All Data Records is enabled and editable
    And verify Add Tag is enabled and editable
    And verify Add Report is enabled and editable
    And verify Export Data Records is enabled and editable
    And verify USB is enabled and editable
    And verify Print is enabled and editable
    And verify CIFS is enabled and editable
    And verify Network Printer is enabled and editable

    Then go to Data Report Screen
    And verify Filter Data Reports is enabled and editable
    And verify Delete All Data Reports is enabled and editable
    And verify Delete Data Report is enabled and editable
    And verify Export Data Reports is enabled and editable
    And verify USB for Reports is enabled and editable
    And verify Print for Reports is enabled and editable
    And verify CIFS for Reports is enabled and editable
    And verify Network Printer for Reports is enabled and editable
    And verify Filter Audit Trails is enabled and editable
    And verify Export Audit Trails is enabled and editable
    And verify USB for Audit Trail is enabled and editable
    And verify CIFS for Audit Trail is enabled and editable
    And verify Set Audit Trail Comments is enabled and editable

    Then go to Setting Screen
    And verify Sample Parameters is enabled and editable
    And verify Locations is listed under Sample Parameters
    And verify Presets is listed under Sample Parameters
    And verify Sample Plans is listed under Sample Parameters
    And verify Certifications is listed under Sample Parameters
    And verify Users is disabled and editable
    And verify Connectivity suboption is listed
    And verify Ethernet_WiFi is enabled and editable
    And verify AD_LDAP_CIFS_Network Printer_3rd Party API is enabled and editable
    And verify under Instrument Time is enabled and editable
    And verify Audio_Visual is enabled and editable
    And verify Options is enabled and editable
    And verify Output is enabled and editable
    And verify Configuration is enabled and editable
    And verify Service is enabled and editable

    Then go to Users tab
    And verify no users added
    And "No User selected" message is displayed inside the "Assigned Users" table

    Then go to Priority tab
    And All 4 permission levels were displayed
    And Priority UP and Down arrows were displayed on the left side
    And press down arrow once and verify Power User level changed to 3
    And verify up arrow is enabled
    And down Arrow is disabled because its only for Unassigned
    And click on up arrow to put "Power" user to level 2
    And verify Power User cannot go to level 1

    Then go to Name tab
    And verify keyboard was displayed
    And "Power User" was displayed under enter Permission Level Name
    Then click on Close button and verify users screen displayed

  Scenario: Default Operator User Permission level
    When I click on Operator User, Permission Level was highlighted in BLUE
    And Edit button was enabled
    And Delete button was enable
    Then I click on Edit button
    And verify header of the screen as "Operator"
    And verify Close and Save buttons
    Then click on Close button and verify users screen displayed
    Then I click on Edit button
    And verify four tabs present Main Screen, Data Record Screen, Data Report Screen and Setting Screen
    And verify Permission, Users, Priority and Name tabs
    And verify Permissions and Users tab are enabled
    And verify Priority and Name tab are enabled

    And verify StartStop is enabled and editable
    And verify Data Record Screen is enabled and editable
    And verify Data Report Screen is enabled and editable
    And verify Setting Screen is disabled and editable

    Then go to Data Record Screen
    And verify Filter Data Records is enabled and editable
    And verify Delete All Data Records is disabled and editable
    And verify Add Tag is enabled and editable
    And verify Add Report is enabled and editable
    And verify Export Data Records is enabled and editable
    And verify USB is enabled and editable
    And verify Print is enabled and editable
    And verify CIFS is enabled and editable
    And verify Network Printer is enabled and editable

    Then go to Data Report Screen
    And verify Filter Data Reports is enabled and editable
    And verify Delete All Data Reports is disabled and editable
    And verify Delete Data Report is disabled and editable
    And verify Export Data Reports is enabled and editable
    And verify USB for Reports is enabled and editable
    And verify Print for Reports is enabled and editable
    And verify CIFS for Reports is enabled and editable
    And verify Network Printer for Reports is enabled and editable
    And verify Filter Audit Trails is enabled and editable
    And verify Export Audit Trails is enabled and editable
    And verify USB for Audit Trail is enabled and editable
    And verify CIFS for Audit Trail is enabled and editable
    And verify Set Audit Trail Comments is enabled and editable

    Then verify Setting Screen tab is disabled

    Then go to Users tab
    And verify no users added
    And "No User selected" message is displayed inside the "Assigned Users" table

    Then go to Priority tab
    And All 4 permission levels were displayed
    And Priority UP and Down arrows were displayed on the left side
    And verify up arrow is enabled
    And down Arrow is disabled because its only for Unassigned
    And click on up arrow to put "Operator" user to level 2
    And verify Operator User cannot go to level 1
    And verify down arrow is enabled
    And click on down arrow to put user to level 3
    And down Arrow is disabled because its only for Unassigned

    Then go to Name tab
    And verify keyboard was displayed
    And "Operator" was displayed under enter Permission Level Name
    Then click on Close button and verify users screen displayed

  Scenario: Default Unassigned Permission level
    When I click on Unassigned, Permission Level was highlighted in BLUE
    And Edit button stayed disabled
    And Delete button stayed disabled

  Scenario: Create Permission Level
    When click on Add New Permission Level button
    Then verify screen header as "New Permission Level"

    Then verify "Main Screen" tab displayed
    And StartStop "enable"
    And Data Record Screen "enable"
    And Data Report Screen "enable"
    And Setting Screen "enable"

    Then click on "Data Record Screen" tab
    And Filter Data Records "disable"
    And Delete All Data Records "disable"
    And Add Tag "enable"
    And Add Report "disable"
    And Export Data Records "enable"
    And USB "disable" under Export Data Records
    And Print "enable" under Export Data Records
    And CIFS "disable" under Export Data Records
    And Network Printer "enable" under Export Data Records

    Then click on "Data Report Screen" tab
    And Filter Data Reports "disable"
    And Delete All Data Reports "disable"
    And Delete Data Report "disable"
    And Export Data Reports "disable"
    And USB "enable" under Export Data Reports
    And Print "enable" under Export Data Reports
    And CIFS "enable" under Export Data Reports
    And Network Printer "enable" under Export Data Reports
    And Filter Audit Trails "disable"
    And Export Audit Trails "enable"
    And USB "enable" under Export Audit Trails
    And CIFS "enable" under Export Audit Trails
    And Set Audit Trail Comments "enable"

    Then click on "Setting Screen" tab
    And Sample Parameters "enable"
    And Users "enable"
    And Ethernet_FiWi "disable" under Connectivity
    And AD_LDAP_CIFS_Network Printer_3rd Party API "disable" under Connectivity
    And Time "disable" under Instrument
    And Audio_Visual "disable" under Instrument
    And Options "disable" under Instrument
    And Output "disable" under Instrument
    And Configuration "disable" under Instrument
    And Service "disable"

    Then click on Name tab and enter permission level name as "Test4"

  Scenario: Delete Permission Level
    When select Permission Level "Test2" and click Delete button
    And verify Permission Level "Test2" deleted

  Scenario Outline: Create users
    Then click on Add new User
    And verify New User window displayed
    And verify Local option selected
    Then click on Username button
    And create user with "<permission>" level
    And click Save button
    Then verify user with "<permission>" level was created
    Examples:
      | permission |
      | admin      |
      | powerUser  |
      | operator   |

  Scenario: Delete Users
    When select user "Admin1" and click Delete button








