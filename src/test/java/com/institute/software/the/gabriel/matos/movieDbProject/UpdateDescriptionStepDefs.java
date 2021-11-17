package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UpdateDescriptionStepDefs {

    @Autowired
    private MovieRepository movieRepository;

    @Given("the film with id {int} exists in the database")
    public void theFilmWithIdExistsInTheDatabase(int id) {
        movieRepository.findById(id);
    }

    @When("I update description of film with id {int} to {string}")
    public void iUpdateTheDescription(int id, String description) {
        var testMovie = movieRepository.findById(id).get();
        testMovie.setDescription(description);
        movieRepository.save(testMovie);
    }

    @Then("the film with ID {int} should have description {string} in the database")
    public void iShouldSeeTheUpdatedDescriptionOfMovieWithIdOf(int id, String description) {
        assertEquals(movieRepository.findById(id).get().getDescription(), description);
    }

}

