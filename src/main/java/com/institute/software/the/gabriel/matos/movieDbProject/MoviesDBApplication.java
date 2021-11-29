package com.institute.software.the.gabriel.matos.movieDbProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@CrossOrigin("*")
	@GetMapping("/movies")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

//	@CrossOrigin("*")
//	@PostMapping("/addfilm")
//	public @ResponseBody
//	String create(
//			@RequestParam int movie_id,
//			@RequestParam String title,
//			@RequestParam String description,
//			@RequestParam int release_yr,
//			@RequestParam int length,
//			@RequestParam String rating
//	){
//		Movie newfilm = new Movie(movie_id, title, description, release_yr, length, rating);
//		movieRepository.save(newfilm);
//		return "Your film has been added";
//	}
	@CrossOrigin("*")
	@PostMapping("/addfilm")
	public ResponseEntity<Movie> addAFilm(@RequestBody Movie newFilm){
		Movie savedMovie = new Movie(newFilm.getFilm_id(), newFilm.getTitle(), newFilm.getDescription(), newFilm.getRelease_yr(), newFilm.getDuration(), newFilm.getRating());
		movieRepository.save(savedMovie);
		return new ResponseEntity<Movie>(savedMovie, HttpStatus.OK);
	}

	@CrossOrigin("*")
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

	@CrossOrigin("*")
	@DeleteMapping("/deletefilm/{film_id}")
	public String deleteById(@PathVariable("film_id") int film_id) {
		movieRepository.deleteById(film_id);
		return "Film Removed";
	}

}
