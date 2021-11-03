package com.institute.software.the.gabriel.matos.movieDbProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MoviesDbApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testMoviegetTitle(){

		Movie testFilm = new Movie ("The Hunger Games", "4");
		assertEquals("The Hunger Games", testFilm.getTitle());
	}
	@Test
	public void testMoviegetRating(){

		Movie testFilm = new Movie ("The Hunger Games", "4");
		assertEquals("4",testFilm.getRating());
	}


//	@Test
//	public void testMoviesetTitle(){
//
//		Movie testFilm = new Movie();
//		testFilm.setTitle("Harry Potter");
//		assertEquals("The title was incorrect", "Harry Potter", testFilm.getTitle());
//	}
//	@Test
//	public void testMoviesetRating(){
//
//		Movie testFilm = new Movie();
//		testfilm.setRating("R");
//		assertEquals("The rating was incorrect", "R", testfilm.getRating());
//	}

//


}




