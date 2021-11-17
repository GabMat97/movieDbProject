Feature: Adding new film
  As an admin I want to add a new film to the database so that it can be accessed by users at a later point.

  Scenario: a new film is added to the database successfully using all information
    Given the title, description, release year, duration and rating information is available
    When i try to add the film with movie ID 1001, title "Lord of the Rings", description "Po-tay-toes", release year 2009, duration 191 and rating "R" to the database
    Then the new film in the database should have title "Lord of the Rings", description "Po-tay-toes", release year 2009, duration 191 and rating "R"
