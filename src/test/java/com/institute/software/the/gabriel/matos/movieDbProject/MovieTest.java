package com.institute.software.the.gabriel.matos.movieDbProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MovieTest {

	@Test
	void contextLoads() {
	}

	//Testing getters

	@Test
	public void testFilmId() {
		Movie movieTest = new Movie(999, "The Hunger Games", "Bows and guns", 2013, 1, 121, "PG-13");
		assertEquals(999, movieTest.getFilm_id(), "Wrong film id");
	}

	@Test
	public void testMovieTitle(){
		Movie movieTest = new Movie (999, "The Hunger Games","Bows and guns",2013,1,121,"PG-13");
		assertEquals("The Hunger Games", movieTest.getTitle(), "Wrong movie title");
	}

	@Test
	public void testYearOfRelease() {
		Movie movieTest = new Movie(999, "The Hunger Games", "Bows and guns", 2013, 1, 121, "PG-13");
		assertEquals(2013, movieTest.getRelease_year(), "Wrong release year");
	}

	@Test
	public void durationOfMovie() {
		Movie movieTest = new Movie(999, "The Hunger Games", "Bows and guns", 2013, 1, 121, "PG-13");
		assertEquals(999, movieTest.getFilm_id(), "Wrong valid ID");
	}

	@Test
	public void ratingOfMovie() {
		Movie movieTest = new Movie(999, "The Hunger Games", "Bows and guns", 2013, 1, 121, "PG-13");
		assertEquals("PG-13", movieTest.getRating(), "Wrong movie duration");
	}

	@Test
	public void testLanguageId() {
		Movie movieTest = new Movie(999, "The Hunger Games", "Bows and guns", 2013, 1, 121, "PG-13");
		assertEquals(1, movieTest.getLanguage_id(), "Wrong language ID");
	}

	@Test
	public void testDescription() {
		Movie movieTest = new Movie(999, "The Hunger Games", "Bows and guns", 2013, 1, 121, "PG-13");
		assertEquals("Bows and guns", movieTest.getDescription(), "Wrong description");
	}

	//Testing Setters

	@Test
	public void testSetFilmID() {
		Movie movieTest = new Movie();
		movieTest.setId(999);
		assertEquals(999, movieTest.getFilm_id(), "The film id was incorrect");
	}

	@Test
	public void testSetTitleMethod() {
		Movie movieTest = new Movie();
		movieTest.setTitle("The Hunger Games");
		assertEquals("The Hunger Games", movieTest.getTitle(), "The title was incorrect");
	}

	@Test
	public void testSetDescription() {
		Movie movieTest = new Movie();
		movieTest.setDescription("Bows and guns");
		assertEquals("Bows and guns", movieTest.getDescription(), "The description is incorrect");
	}

	@Test
	public void testSetRelease_Year() {
		Movie movieTest = new Movie();
		movieTest.setRelease_year(2013);
		assertEquals(2013, movieTest.getRelease_year(), "The release year was incorrect");
	}

	@Test
	public void testSetLanguage() {
		Movie movieTest = new Movie();
		movieTest.setLanguage_id(1);
		assertEquals(1, movieTest.getLanguage_id(), "The language was incorrect");
	}

	@Test
	public void testSetDuration() {
		Movie movieTest = new Movie();
		movieTest.setDuration(121);
		assertEquals(121, movieTest.getDuration(), "The duration was incorrect");
	}

	@Test
	public void testSetRating() {
		Movie movieTest = new Movie();
		movieTest.setRating("PG-13");
		assertEquals("PG-13", movieTest.getRating(), "The rating was incorrect");
	}

}




