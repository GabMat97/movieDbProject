Feature: Deleting film from database
  As an admin I want to delete a film in the database if it is no longer needed so that it does not clutter any queries.

  Scenario: a film is deleted successfully
    Given the film with title "AIRPLANE SIERRA" is in the database already
    When i try to delete the existing film
    Then the film with title "AIRPLANE SIERRA" should not be in the database
