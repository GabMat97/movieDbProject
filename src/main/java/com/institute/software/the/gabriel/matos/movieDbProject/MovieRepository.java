package com.institute.software.the.gabriel.matos.movieDbProject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends CrudRepository <Movie, Integer> {
    @Query("SELECT m from Movie m WHERE m.title LIKE %:title%")
    List<Movie> searchByTitleLike(@Param("title") String title);
}
