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
	public void testMovieTitle(){
		Movie movieTest = new Movie (1,"The Hunger Games","Bows and guns",2013,121,"PG-13");
		assertEquals("The Hunger Games", movieTest.getTitle(), "Wrong movie title");
	}

	@Test
	public void testRelease_yr() {
		Movie movieTest = new Movie(1,"The Hunger Games", "Bows and guns", 2013,  121, "PG-13");
		assertEquals(2013, movieTest.getRelease_yr(), "Wrong release year");
	}

	@Test
	public void durationOfMovie() {
		Movie movieTest = new Movie(1,"The Hunger Games", "Bows and guns", 2013,  121, "PG-13");
		assertEquals(121, movieTest.getDuration(), "Wrong duration");
	}

	@Test
	public void ratingOfMovie() {
		Movie movieTest = new Movie(1,"The Hunger Games", "Bows and guns", 2013,  121, "PG-13");
		assertEquals("PG-13", movieTest.getRating(), "Wrong movie rating");
	}

	@Test
	public void testLanguageId() {
		Movie movieTest = new Movie(1,"The Hunger Games", "Bows and guns", 2013,  121, "PG-13");
		assertEquals(1, movieTest.getLanguage_id(), "Wrong language ID");
	}

	@Test
	public void testDescription() {
		Movie movieTest = new Movie(1,"The Hunger Games", "Bows and guns", 2013,  121, "PG-13");
		assertEquals("Bows and guns", movieTest.getDescription(), "Wrong description");
	}

	//Testing Setters

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
	public void testSetRelease_Yr() {
		Movie movieTest = new Movie();
		movieTest.setRelease_yr(2013);
		assertEquals(2013, movieTest.getRelease_yr(), "The release year was incorrect");
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
		movieTest.setDuration(0);
		assertEquals(0, movieTest.getDuration(), "The Duration was incorrect");
	}

	@Test
	public void testSetRating() {
		Movie movieTest = new Movie();
		movieTest.setRating("PG-13");
		assertEquals("PG-13", movieTest.getRating(), "The rating was incorrect");
	}

}




