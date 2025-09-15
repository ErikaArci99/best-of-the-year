package org.lessons.java.best_of_the_year.controllers;

import java.util.List;
import org.lessons.java.best_of_the_year.models.Movie;
import org.lessons.java.best_of_the_year.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    // Metodi pubblici
    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("list", getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("list", getBestSongs());
        return "songs";
    }
}
