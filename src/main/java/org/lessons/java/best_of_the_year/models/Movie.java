package org.lessons.java.best_of_the_year.models;

public class Movie {

    // attributi
    private String movieTitle;
    private int movieId;

    // costruttore vuoto
    public Movie() {

    }

    // costruttore
    public Movie(String movieTitle, int movieId) {
        this.movieTitle = movieTitle;
        this.movieId = movieId;
    }

    // metodi get
    public String getMovieTitle() {
        return movieTitle;
    }

    public int getMovieId() {
        return movieId;
    }

    // metodi set
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    // override toString
    @Override
    public String toString() {
        return String.format("%s, %s", movieTitle, movieId);
    }
}
