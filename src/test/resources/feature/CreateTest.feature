Feature: Creating a movie with all the parameters
  As a user I want to create a movie using the film id, film title, year, description, length and rating.

  Scenario: user searches for film by title that exists in database
    Given the film with the information is available
    When i try to add the film  to the database with film id 1001, title "The Hunger Games", description "Bows and guns", year 2005, language id 1,  length 165 and rating "PG-13"
    Then the new film in the database should have film id 1001, title "The Hunger Games", year 2005, language id 1, description "Bows and guns", length 165 and rating "PG-13"
