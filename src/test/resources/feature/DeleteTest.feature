Feature: Delete a movie according to film id parameters
  As a user I want to delete a movie using the film id

  Scenario: the movie exists in the database to be deleted
    Given the movie with title "AIRPLANE SIERRA" already exists
    When i try to delete the existing movie
    Then the film with title "AIRPLANE SIERRA" should not be in the database