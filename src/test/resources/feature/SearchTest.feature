Feature: Searching for a film using film title
  As a user I want to search for movies using the film title so that I can find the film I am looking for.

  Scenario: user searches for film by title that exists in database
    Given the film with title "ALADDIN CALENDAR" is in the database
    When i search for for film with title "ALADDIN CALENDAR"
    Then i should see film info







#As a user I want to be able to create a movie of my choosing to the application and add its title, review and rating.
#a. Scenario: User creates a review about an existing movie.
#i. Given the movie exists, when the user creates a review about the movie, then the review and rating will be added onto the front end and the database.
#b. Scenario: User creates a review about a non-existing movie.
#i. Given the movie does not exist, when the user creates a review about the movie, then an error message should come up and nothing will be added to the database.
#
#As a user I want to be able to search through the entire list of movies available to be reviewed.
#a. Scenario: User searches through a search bar using a sequence of characters that at least one movie contains.
#i. Given the movie exists, when the user search through the search bar, then the movie will be displayed.
#b. Scenario: User searches through the search bar and no movie correlates with the searched text.
#i. Given the movie does not exist, when the user searches through the search form, then an error message should show up stating there are no matched movies.
#
#As an admin I want to be able to add a movie to the database so that it is ready to be reviewed by users.
#a. Scenario: I am able to manually add a movie to the database.
#i. Given I am able to add a movie to the database, when I attempt to do so, I get a message stating "Success".
#b. Scenario: I am not able to manually add a movie to the database because it already exists.
#i. Given I am not able to add a movie to the database manually, when I attempt to do so, then I get a message stating "Unsuccessful".
#
#As an admin I want to be able to update any cell in the database manually.
#a. Scenario: I am able to update any part of a review made to the database.
#i. Given I am able to update a section of a review manually, when I change it in the database, then I will be able to see the change made.
#b. Scenario: I am not able to update any part of a review made to the database because I attempted to change it to the same content as it is.
#i. Given I am not able to update a section of a review manually, when I change it in the database, I will get an error message saying "It already says that".
#
#As an admin I want to be able to delete a review manually.
#a. Scenario: I am able to delete a review made by a user.
#i. Given I am able to delete a review, when I delete it in the database manually, then I will no longer be able to see the review.
#b. Scenario: I am not able to delete a review because it does not exist.
#i. Given I am not able to delete a review, when I attempt to delete it, then I will get an error message saying "It does not exist".