Feature: Update a movie description using film id
  As a user I want to update a movie description using the film id so that I can update a film.

  Scenario: user updates film description successfully
    Given the film with id 911 exists in the database
    When I update description of film with id 911 to "this is a new description"
    Then I should see the updated description of movie with id 911 of "this is a new description"