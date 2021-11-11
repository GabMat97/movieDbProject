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

    @Given("the film with the information is available")
    public void theFilmWithTheInformationIsAvailable() {
    }

    @When("i try to add the film  to the database with film id {int}, title {string}, description {string}, year {int}, language id {int},  length {int} and rating {string}")
    public void iTryToAddTheFilmToTheDatabaseWithFilmIdTitleDescriptionYearLanguageIdLengthAndRating(int film_id, String title, String description, int release_year, int language_id, int length, String rating) {
        testMovie = new Movie(film_id, title, description, release_year, language_id, length, rating);
        movieRepository.save(testMovie);
    }

    @Then("the new film in the database should have film id {int}, title {string}, description {string}, year {int}, language id {int}, length {int} and rating {string}")
    public void theNewFilmInTheDatabaseShouldHaveFilmIdTitleYearDescriptionLengthAndRating(int film_id, String title, String description, int release_year, int language_id, int length, String rating) {
        int idForNewFilm = movieRepository.searchByTitleLike(title).get(0).getFilm_id();
        assertEquals(movieRepository.findById(idForNewFilm).get().getFilm_id(), film_id);
        assertEquals(movieRepository.findById(idForNewFilm).get().getTitle(), title);
        assertEquals(movieRepository.findById(idForNewFilm).get().getDescription(), description);
        assertEquals(movieRepository.findById(idForNewFilm).get().getRelease_year(), release_year);
        assertEquals(movieRepository.findById(idForNewFilm).get().getLanguage_id(), language_id);
        assertEquals(movieRepository.findById(idForNewFilm).get().getDuration(), length);
        assertEquals(movieRepository.findById(idForNewFilm).get().getRating(), rating);
    }


}