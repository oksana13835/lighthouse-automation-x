Feature: Create Data Tags

  Background:
    Given open ApexZ web page
#    When login as "Admin1" "pwd"
    And navigate to home screen
    Then click on Settings
    And click on Instrument
    And click on Options
    And click on Data Tags


  Scenario: Creating Data Tag1
    Then click Add New Data Tag button
    #####------- change highlighted values inside "" to enable/disable/PreSample/PostSample/Annotation names -----######
    ##### ------ next 3 scenarios will be IGNORED if Prompt is disable                                    --------######

    When create Tag_1 with Prompt "disable"
    And select "Pre Sample"
    And Allow Bypass "enable"
    And Apply to Certifications "disable"
    And Lock Entry "enable"
    And create first Annotation and name it "Annotation 1"
    And create second Annotation and name it "Annotation 2"
    And create third Annotation and name it "Annotation 3"
    And create fourth Annotation and name it "Annotation 4"
    And create fifth Annotation and name it "Annotation 5"
    And name data tag as "Tag1"

  Scenario: Creating Data Tag2
    Then click Add New Data Tag button
    When create Tag_2 with Prompt "enable"
    And select "Post Sample"
    And Allow Bypass "disable"
    And Apply to Certifications "enable"
    And Lock Entry "enable"
    And create first Annotation and name it "Annotation 1"
    And create second Annotation and name it "Annotation 2"
    And create third Annotation and name it "Annotation 3"
    And create fourth Annotation and name it "Annotation 4"
    And create fifth Annotation and name it "Annotation 5"
    And name data tag as "Tag2"

  Scenario: Creating Data Tag3
    Then click Add New Data Tag button
    When create Tag_3 with Prompt "enable"
    And select "Pre Sample"
    And Allow Bypass "enable"
    And Apply to Certifications "disable"
    And Lock Entry "enable"
    And create first Annotation and name it "Annotation 1"
    And create second Annotation and name it "Annotation 2"
    And create third Annotation and name it "Annotation 3"
    And create fourth Annotation and name it "Annotation 4"
    And create fifth Annotation and name it "Annotation 5"
    And name data tag as "Tag3"

  Scenario: Creating Data Tag4
    Then click Add New Data Tag button
    When create Tag_4 with Prompt "disable"
    And select "Pre Sample"
    And Allow Bypass "enable"
    And Apply to Certifications "disable"
    And Lock Entry "disable"
    And create first Annotation and name it "Annotation 1"
    And create second Annotation and name it "Annotation 2"
    And create third Annotation and name it "Annotation 3"
    And create fourth Annotation and name it "Annotation 4"
    And create fifth Annotation and name it "Annotation 5"
    And name data tag as "Tag4"

  Scenario: Creating Data Tag5
    Then click Add New Data Tag button
    When create Tag_5 with Prompt "enable"
    And select "Post Sample"
    And Allow Bypass "disable"
    And Apply to Certifications "disable"
    And Lock Entry "enable"
    And create first Annotation and name it "Annotation 1"
    And create second Annotation and name it "Annotation 2"
    And create third Annotation and name it "Annotation 3"
    And create fourth Annotation and name it "Annotation 4"
    And create fifth Annotation and name it "Annotation 5"
    And name data tag as "Tag5"

  Scenario: Deleting Data Tag
    Then select data tag "Tag3" and delete


#    And go to Home screen
 #   And start collecting data