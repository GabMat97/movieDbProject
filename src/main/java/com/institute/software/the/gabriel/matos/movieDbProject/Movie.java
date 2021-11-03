package com.institute.software.the.gabriel.matos.movieDbProject;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Movie {

    @Id
    @Column(name = "film_id")
    private int id;



    private String title;

    private String rating;

    public Movie(String title, String rating) {
        this.title = title;
        this.rating = rating;
    }
    public Movie(){

    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {

        this.rating = rating;
    }
}
