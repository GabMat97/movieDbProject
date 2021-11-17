Feature: Update a movie description using film id
  As a user I want to update a movie description using the film id so that my project is up to date.

  Scenario: user updates film description successfully
    Given the film with id 911 exists in the database
    When I update description of film with id 911 to "this is a new description"
    Then the film with ID 911 should have description "this is a new description" in the database
