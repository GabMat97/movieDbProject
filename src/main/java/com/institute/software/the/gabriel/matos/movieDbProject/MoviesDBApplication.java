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
		var updateFilm= movieRepository.findById(film_id).get();
		updateFilm.setDescription(description);
		movieRepository.save(updateFilm);
		return "Your film description has been updated";
	}

	@DeleteMapping("/deletefilm")
	public@ResponseBody
			String delete(
					@RequestParam int film_id
	) {
			var deleteFilm = movieRepository.findById(film_id).get();
			movieRepository.delete(deleteFilm);
			return "Your movie has been deleted";
	}

}

