package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class CreateFilmStepDefs {

    @Autowired
    private MovieRepository movieRepository;

    private Movie testMovie;

    @Given("the title, description, release year, duration and rating information is available")
    public void theTitleDescriptionReleaseYearDurationAndRatingInformationIsAvailable() {
    }

    @When("i try to add the film with movie ID {int}, title {string}, description {string}, release year {int}, duration {int} and rating {string} to the database")
    public void iTryToAddTheFilmWithMovieIdTitleDescriptionReleaseYearDurationAndRatingToTheDatabase(int film_id, String title, String description, int release_yr, int duration, String rating) {
        testMovie = new Movie(film_id, title, description, release_yr, duration, rating);
        movieRepository.save(testMovie);
    }

    @Then("the new film in the database should have title {string}, description {string}, release year {int}, duration {int} and rating {string}")
    public void theNewFilmInTheDatabaseShouldHaveTitleDescriptionReleaseYearDurationAndRating(String title, String description, int release_yr, int duration, String rating) {
        int idForNewFilm = movieRepository.searchByTitleLike(title).get(0).getFilm_id();
        assertEquals(movieRepository.findById(idForNewFilm).get().getTitle(), title);
        assertEquals(movieRepository.findById(idForNewFilm).get().getRelease_yr(), release_yr);
        assertEquals(movieRepository.findById(idForNewFilm).get().getDescription(), description);
        assertEquals(movieRepository.findById(idForNewFilm).get().getDuration(), duration);
        assertEquals(movieRepository.findById(idForNewFilm).get().getRating(), rating);
    }


}