package com.institute.software.the.gabriel.matos.movieDbProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
//@RequestMapping("movies")
public class MoviesDBApplication {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {

		SpringApplication.run(MoviesDBApplication.class, args);
	}

	@GetMapping("/movies")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

//	@PostMapping("/addMovie")
//	public @ResponseBody.String addAMovie (@RequestParam String name, @RequestParam String review , @RequestParam int rating) {
//		Movie savedMovie = new Movie(name, review, rating);
//		movieRepository.save(savedMovie);
//		return "Saved";
//	}
}

