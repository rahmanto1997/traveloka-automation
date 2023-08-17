@localTraveloka
Feature: 00_Localization

  Scenario: User first impression traveloka apps
    Given user on screen pick country and language
    When user choose location Indonesia
    And user choose preferred Indonesia language
    Then user click button next
    And user click button join

  Scenario: User choose menu flight
    Given user on screen home
    When user click flight menu
    And user choose from "Soekarno Hatta"
    And user choose to "Minangkabau Intl"
    Then user click button search