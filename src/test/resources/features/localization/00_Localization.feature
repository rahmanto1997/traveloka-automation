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

  Scenario: User choose not round-trip
    And user click from destination
    And user choose from "Soekarno Hatta"
    And user click to destination
    And user choose to "Minangkabau Intl"
    Then user click button search

  Scenario: User choose round-trip
    And user click from destination Soetta
    And user choose from "Soekarno Hatta"
    And user click to destination Padang
    And user choose to "Minangkabau Intl"
    And user click roundtrip
    Then user click button search

  Scenario: User choose first class non round-trip
    And user click from destination Soetta
    And user choose from "Soekarno Hatta"
    And user click to destination Padang
    And user choose to "Minangkabau Intl"
    And user click nonroundtrip
    And user choose first class
    Then user click button search

  Scenario: User choose first class with round-trip
    And user click from destination Soetta
    And user choose from "Soekarno Hatta"
    And user click to destination Padang
    And user choose to "Minangkabau Intl"
    And user click roundtrip
    Then user click button search