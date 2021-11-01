package com.institute.software.the.gabriel.matos.movieDbProject;

public class Movie {
    private String name;
    private String review;
    private int rating;

    public Movie(String name, String review, int rating) {
        this.name = name;
        this.review = review;
        this.rating = rating;
    }
    public Movie(){

    }
    public String getName() {
        return name;
    }
    public String getReview() {
        return review;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public String setReview(String review) {
        this.review = review;
    }
    public int getRating() {
        return rating;
    }
    public int setRating(int rating) {
        this.rating = rating;
    }
}
