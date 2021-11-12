package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeleteFilmStepDefs {

    @Autowired
    private MovieRepository movieRepository;

    private Movie testMovie;

    private Movie response;

    @Given("the movie with title {string} already exists")
    public void theMovieWithTitleIsInTheDataBase(String title) {
        response = movieRepository.searchByTitleLike(title).get(0);
        System.out.println(response.getFilm_id());

    }

    @When("i try to delete the existing movie")
    public void iTryToDeleteTheExistingMovie() {
        Integer zzz = response.getFilm_id();
        movieRepository.deleteById(zzz);
        System.out.println(zzz);
    }

    @Then("the film with title {string} should not be in the database")
    public void theFilmWithTitleShouldNotBeInTheDatabase(String removedTitle) {
        Object a = response.getFilm_id();
        Object b = movieRepository.searchByTitleLike(removedTitle);
        assertNotEquals(a, b);
    }
}