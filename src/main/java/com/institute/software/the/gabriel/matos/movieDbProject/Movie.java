package com.institute.software.the.gabriel.matos.movieDbProject;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int film_id;
    private String title;
    private String description;
    private int release_year;
    private int language_id;
    private int duration;
    private String rating;


    public Movie(int film_id, String title, String description, int release_year, int language_id, int duration, String rating) {
        this.film_id= film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.duration = duration;
        this.rating = rating;
    }
    public Movie(){

    }

    public int getFilm_id() {
        return film_id;
    }

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

    public int getRelease_year() {
        return release_year;
    }

    public void  setRelease_year(int release_year) {
        this.release_year = release_year;
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

    public void  setDuration(int duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void  setRating(String rating) {
        this.rating = rating;
    }


}
