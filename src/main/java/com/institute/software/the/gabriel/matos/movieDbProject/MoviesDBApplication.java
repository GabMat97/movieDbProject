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

//	@DeleteMapping("/deletefilm")
//	public @ResponseBody
//			String delete(
//					@RequestParam int film_id
//	) {
//			Movie deleteFilm = movieRepository.findById(film_id).get();
//			movieRepository.deleteById(deleteFilm.getFilm_id());
//			return "Your movie has been deleted";
//	}

}

