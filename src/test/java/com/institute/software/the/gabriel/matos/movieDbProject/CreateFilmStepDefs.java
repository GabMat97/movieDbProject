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
    private Movie testFilm2;


    @Given("the title, description, release year, language ID, duration and rating information is available")
    public void theTitleDescriptionReleaseYearLanguageIDDurationAndRatingInformationIsAvailable() {
    }
    @When("i try to add the film with film id {int}, title {string},  description {string}, language id {int}, release year {int}, duration {int} and rating {string} to the database")
    public void iTryToAddTheFilmWithFilmIdTitleDescriptionLanguageIdReleaseYearDurationAndRatingToTheDatabase(int film_id, String title, String description, int release_year, int language_id, int duration, String rating) {
        testMovie = new Movie(film_id, title, description, release_year, language_id, duration, rating);
        movieRepository.save(testMovie);
    }

    @Then("the new film in the database should have title {string}, year {int}, description {string}, length {int} and rating {string}")
    public void theNewFilmInTheDatabaseShouldHaveTitleYearDescriptionLengthAndRating(String title, String description, int release_year, int language_id, int duration, String rating) {
        int idForNewFilm = movieRepository.searchByTitleLike(title).get(0).getFilm_id();
        assertEquals(movieRepository.findById(idForNewFilm).get().getTitle(), title);
        assertEquals(movieRepository.findById(idForNewFilm).get().getTitle(), title);
        assertEquals(movieRepository.findById(idForNewFilm).get().getRelease_year(), release_year);
        assertEquals(movieRepository.findById(idForNewFilm).get().getDescription(), description);
        assertEquals(movieRepository.findById(idForNewFilm).get().getDuration(), duration);
        assertEquals(movieRepository.findById(idForNewFilm).get().getRating(), rating);
    }

}