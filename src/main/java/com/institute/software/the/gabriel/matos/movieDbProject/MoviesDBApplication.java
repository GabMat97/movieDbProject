package com.institute.software.the.gabriel.matos.movieDbProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication

@RequestMapping("/moviesDB")
public class MoviesDBApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoviesDBApplication.class, args);
	}

	@Autowired
	private MovieRepository movieRepository;

	@GetMapping("/movies")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@PostMapping("/addfilm")
	public @ResponseBody
	String create(
			@RequestParam int movie_id,
			@RequestParam String title,
			@RequestParam String description,
			@RequestParam int release_yr,
			@RequestParam int length,
			@RequestParam String rating
	){
		Movie newfilm = new Movie(movie_id, title, description, release_yr, length, rating);
		movieRepository.save(newfilm);
		return "Your film has been added";
	}

	@PutMapping("/updatefilm")
	public @ResponseBody
	String update(
			@RequestParam int movie_id,
			@RequestParam String description
	) {
		Movie updatedFilm= movieRepository.findById(movie_id).orElse(null);
		assert updatedFilm != null;
		updatedFilm.setDescription(description);
		movieRepository.save(updatedFilm);
		return "Your film description has been updated";
	}

	@DeleteMapping("films/deletefilm/{id}")
	public String deleteById(@PathVariable("id") int id) {
		movieRepository.deleteById(id);
		return "Film Removed";
	}

}
