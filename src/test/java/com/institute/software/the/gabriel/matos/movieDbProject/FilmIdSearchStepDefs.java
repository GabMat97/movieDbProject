package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilmIdSearchStepDefs {

    @Autowired
    private MovieRepository movieRepository;

    private Movie testMovie;

    private List<Movie> response;
    private String actualTitle;

    @Given("the film with title {string} is in the database")
    public void FilmIsInDatabase(String title) {

    }

    @When("i search for for film with title {string}")
    public void SearchForFilmId(String title) {
        response = movieRepository.searchByTitleLike(title);
    }

    @Then("i should see film info")
    public Movie SeeMovieInfo() {
        actualTitle = "AMERICAN CIRCUS";
        assertEquals(response.get(0).getTitle(), actualTitle);
        return response.get(0);
    }

}