package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotEquals;

public class DeleteFilmStepDefs {

    @Autowired
    private MovieRepository movieRepository;

    private Movie testFilm;

    private Movie response;

    @Given("the film with title {string} is in the database already")
    public void theFilmWithTitleIsInTheDataBase(String title) {
        response = movieRepository.searchByTitleLike(title).get(0);
    }

    @When("i try to delete the existing film")
    public void iTryToDeleteTheExistingFilm() {
//        movieRepository.deleteById(response.getFilm_id());
    }

    @Then("the film with title {string} should not be in the database")
    public void theFilmWithTitleShouldNotBeInTheDatabase(String title) {
//        assertNotEquals(response.getFilm_id(), movieRepository.searchByTitleLike(title).get(0).getFilm_id());
    }

}