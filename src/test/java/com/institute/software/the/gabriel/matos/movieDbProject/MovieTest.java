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
	public void testMovieNameMethod(){

		Movie testFilm = new Movie ("Harry Potter", "Not too shabby");
		assertEquals("The Book is not Harry Potter", "Harry Potter", testFilm.getName());
	}
}




