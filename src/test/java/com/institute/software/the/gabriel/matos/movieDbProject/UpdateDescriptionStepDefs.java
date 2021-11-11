package com.institute.software.the.gabriel.matos.movieDbProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UpdateDescriptionStepDefs {

    @Autowired
    private MovieRepository movieRepository;

    private Movie testMovie;

    @Given("the film with id {int} exists in the database")
    public void theFilmWithIdExistsInTheDatabase(int id) {

    }

    @When("I update description of film with id {int} to {string}")
    public void iUpdateTheDescription(int id, String description) {
        Movie testMovie = movieRepository.findById(id).get();
        testMovie.setDescription(description);
        movieRepository.save(testMovie);
    }

//    @Then("I should see the updated description of the film")
//    public void iShouldSeeTheNewFilmDescription(int id, String description) {
//        assertEquals(movieRepository.findById(id).get().getDescription(),description);
//    }

    @Then("I should see the updated description of movie with id {int} of {string}")
    public void iShouldSeeTheUpdatedDescriptionOfMovieWithIdOf(int id, String description) {
        assertEquals(movieRepository.findById(id).get().getDescription(), description);
    }
}

