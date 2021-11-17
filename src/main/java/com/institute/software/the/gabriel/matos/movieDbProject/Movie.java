package com.institute.software.the.gabriel.matos.movieDbProject;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "film")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int film_id;
    private int movie_id;
    private String title;
    private String description;
    @Column(name="release_yr")
    private int release_yr;
    @Column(name="language_id")
    private int language_id;
    private int duration;
    private String rating;


    public Movie(int movie_id, String title, String description, int release_yr, int duration, String rating) {

        this.movie_id = movie_id;
        this.title = title;
        this.description = description;
        this.release_yr = release_yr;
        this.language_id = 1;
        this.duration = duration;
        this.rating = rating;
    }

    public Movie(){

    }



    public int getFilm_id() { return film_id; }

    public void setId(int id) {
        this.film_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void  setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void  setDescription(String description) {
        this.description = description;
    }

    public int getRelease_yr() {
        return release_yr;
    }

    public void  setRelease_yr(int release_yr) {
        this.release_yr = release_yr;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void  setLanguage_id(int language) {
        this.language_id = language;
    }

    public int getDuration() {
        return duration;
    }

    public void  setDuration(int length) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void  setRating(String rating) {
        this.rating = rating;
    }


}
