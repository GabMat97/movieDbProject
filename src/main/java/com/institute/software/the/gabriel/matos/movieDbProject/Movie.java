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
    private String title;
    private String description;
    @Column(name="release_year")
    private int release_yr;
    @Column(name="language_id")
    private int language_id;
    @Column(name = "length")
    private int duration;
    private String rating;


    public Movie(int film_id, String title, String description, int release_yr, int duration, String rating) {

        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_yr = release_yr;
        this.language_id = 1;
        this.duration = duration;
        this.rating = rating;
    }

    public Movie(){

    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_yr() {
        return release_yr;
    }

    public void setRelease_yr(int release_yr) {
        this.release_yr = release_yr;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
