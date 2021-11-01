Feature: Ordnance Datahub Page
  Background: User Launch the BROWSER
    Given I Launched the Browser

  Scenario Outline: User Navigate to the Datahub Page
    When I navigate to the OSDatahub Page <url>
    And I click accept cookies
    Then I should see the page load correctly
    Then I should see a welcome message saying <message>
    When I navigate to the Doc page
    Then I should see the Doc page header <header>
    When I click on the side menu
    Then I should see highlighted page displayed <sidemenu>
    And the current Url should be <currentUrl>

    Examples:
      | url                        | message                                   | header          | sidemenu                      |   currentUrl                                      |
      | "https://osdatahub.os.uk/" | "Welcome to the Ordnance Survey Data Hub" | 'Documentation' |  "OS Downloads API: Overview" | "https://osdatahub.os.uk/docs/downloads/overview" |
