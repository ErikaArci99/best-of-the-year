package org.lessons.java.best_of_the_year.controllers;

import java.util.List;
import org.lessons.java.best_of_the_year.models.Movie;
import org.lessons.java.best_of_the_year.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;

@Controller
public class HomeController {

    @GetMapping("/") // rotta
    public String home(Model model) {
        // passo il mio nome come attributo al model
        model.addAttribute("name", "Erika");
        // indico che deve caricare la view "index.html"
        return "index";
    }

    // metodi privati
    private List<Movie> getBestMovies() {
        return Arrays.asList(
                new Movie("Inception", 1),
                new Movie("Titanic", 2),
                new Movie("Avatar", 3));
    }

    private List<Song> getBestSongs() {
        return Arrays.asList(
                new Song("Imagine", 1),
                new Song("Hey Jude", 2),
                new Song("Shape of You", 3));
    }

    // Metodi pubblici: restituiscono liste di oggetti
    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies()); // lista di oggetti Movie
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs()); // lista di oggetti Song
        return "songs";
    }

    // Metodo /movies/{id}
    @GetMapping("/movies/{id}")
    public String movieById(@PathVariable int id, Model model) {
        Movie movie = getBestMovies().get(id - 1);
        model.addAttribute("title", movie.getMovieTitle());
        return "movie-detail";
    }

    // Metodo /songs/{id}
    @GetMapping("/songs/{id}")
    public String songById(@PathVariable int id, Model model) {
        Song song = getBestSongs().get(id - 1);
        model.addAttribute("title", song.getSongTitle());
        return "song-detail";
    }
}
