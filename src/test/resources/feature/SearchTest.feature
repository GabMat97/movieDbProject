Feature: Searching for a film using film title
  As a user I want to search for movies using the film title so that I can find the film I am looking for.

  Scenario: user searches for film by title that exists in database
    Given the film with title "AMERICAN CIRCUS" is in the database
    When i search for for film with title "AMERICAN CIRCUS"
    Then i should see film info
