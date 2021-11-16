package com.institute.software.the.gabriel.matos.movieDbProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@SpringBootApplication

@RequestMapping("/movies")
public class MoviesDBApplication {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {

		SpringApplication.run(MoviesDBApplication.class, args);
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@GetMapping("/film")
	public @ResponseBody Iterable<Movie> searchAllMovies(@RequestParam("title") String title) {
		return movieRepository.searchByTitleLike(title);
	}

	@PostMapping("/addfilm")
	public @ResponseBody
	String create(
			@RequestParam int film_id,
			@RequestParam String title,
			@RequestParam String description,
			@RequestParam int release_year,
			@RequestParam int language_id,
			@RequestParam int duration,
			@RequestParam String rating
	){
		Movie newfilm = new Movie(film_id, title, description, release_year, language_id, duration, rating);
		movieRepository.save(newfilm);
		return "Your film has been added";
	}

	@PutMapping("/updatefilm")
	public @ResponseBody
	String update(
			@RequestParam int film_id,
			@RequestParam String description
	) {
		Movie updateFilm= movieRepository.findById(film_id).orElse(null);
		assert updateFilm != null;
		updateFilm.setDescription(description);
		movieRepository.save(updateFilm);
		return "Your film description has been updated";
	}

	@DeleteMapping("films/deletefilm/{id}")
	public String deleteById(@PathVariable("id") int id) {
		movieRepository.deleteById(id);
		return "Film Removed";
	}

}








//package com.institute.software.the.gabriel.matos.movieDbProject;
//
//import com.amazonaws.services.secretsmanager.model.ResourceNotFoundException;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashMap;
//import java.util.Map;
//
////import net.javaguides.springboot.exception.ResourceNotFoundException;
////import net.javaguides.springboot.model.Film;
////import net.javaguides.springboot.repository.MovieRepository;
//
//@CrossOrigin(origins = "3.15.18.162:8080/movies/all")
//@RestController
//@SpringBootApplication
//@RequestMapping("/movies")
//public class MoviesDBApplication {
//
//	@Autowired
//	private MovieRepository movieRepository;
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(MoviesDBApplication.class, args);
//	}
//
////	@GetMapping("/all")
////	public @ResponseBody Iterable<Movie> getAllMovies() {
////		return movieRepository.findAll();
////	}
////
////	@GetMapping("/film")
////	public @ResponseBody Iterable<Movie> searchAllMovies(@RequestParam("title") String title) {
////		return movieRepository.searchByTitleLike(title);
////	}
////
////	@PostMapping("/createfilm")
////	public Movie createFilm(@RequestParam Movie movie) {
////		return movieRepository.save(movie);
////	}
//
////	@PostMapping("/addfilm")
////	public @ResponseBody
////			String create(
////				@RequestParam int film_id,
////				@RequestParam String title,
////				@RequestParam String description,
////				@RequestParam int release_year,
////				@RequestParam int language_id,
////				@RequestParam int duration,
////				@RequestParam String rating
////	){
////		Movie newfilm = new Movie(film_id, title, description, release_year, language_id, duration, rating);
////		movieRepository.save(newfilm);
////		return "Your film has been added";
////	}
//
//
//
//
//
//
//	//Gets movie with id as parameter
////	@GetMapping("/{id}")
////	public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
////		Movie movie = movieRepository.findById(id)
////				.orElseThrow(() -> new ResourceNotFoundException("Movie with that ID does not exist"));
////		return ResponseEntity.ok(movie);
////	}
//
//	//Tutorial get all method
//	@GetMapping("/all")
//	public @ResponseBody Iterable<Movie> getAllMovies() {
//		return movieRepository.findAll();
//	}
//
//	//For onclick event of adding a movie
////	@PostMapping("/all")
////	public Movie createMovie(@RequestBody Movie movie) {
////		return movieRepository.save(movie);
////	}
//
////	//Tutorial update method
////	@PutMapping("/all/{id}")
////	public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie movieDetails) {
////		Movie movie = movieRepository.findById(id)
////				.orElseThrow(() -> new ResourceNotFoundException("Film with that ID does not exist"));
////
////		movie.setTitle(movieDetails.getTitle());
////		movie.setDescription(movieDetails.getDescription());
////		movie.setRelease_year(movieDetails.getRelease_year());
////		movie.setLanguage_id(movieDetails.getLanguage_id());
////		movie.setDuration(movieDetails.getDuration());
////		movie.setRating(movieDetails.getRating());
////		Movie updatedMovie = movieRepository.save(movie);
////		return ResponseEntity.ok(updatedMovie);
////	}
//
////	Updates existing movie and works
//	@PutMapping("/updatefilm")
//	public @ResponseBody
//			String update(
//					@RequestParam int film_id,
//					@RequestParam String description
//	) {
//		Movie updateFilm= movieRepository.findById(film_id).orElse(null);
//		assert updateFilm != null;
//		updateFilm.setDescription(description);
//		movieRepository.save(updateFilm);
//		return "Your film description has been updated";
//	}
//
//	//Tutorial delete method
////	@DeleteMapping("/all/{id}")
////	public ResponseEntity<Map<String, Boolean>> deleteFilm(@PathVariable int id) {
////		Movie movie = movieRepository.findById(id)
////				.orElseThrow(() -> new ResourceNotFoundException("Film with that ID does not exist"));
////
////		movieRepository.delete(movie);
////		Map<String, Boolean> response = new HashMap<>();
////		response.put("deleted", Boolean.TRUE);
////		return ResponseEntity.ok(response);
////	}
//
////	@DeleteMapping("films/deletefilm/{id}")
////	public String deleteById(@PathVariable("id") int id) {
////		movieRepository.deleteById(id);
////		return "Film Removed";
////	}
//
//}
//
