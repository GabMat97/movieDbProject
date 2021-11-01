package com.institute.software.the.gabriel.matos.movieDbProject;

public class Movie {
    private String name;
    private String review;
    public Movie(String name, String review) {
        this.name = name;
        this.review = review;
    }
    public Movie(){

    }
    public String getName() {
        return name;
    }
    public String getReview() {
        return review;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReview(String review) {
        this.review = review;
    }
}
