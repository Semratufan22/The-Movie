Feature: The Movie Feature

  Scenario: Navigating project Movie-db
    Given I am on the homepage
    And There is a menu option Movies
    When I go navigate to Movies
    Then The second item should be Now Playing Movies