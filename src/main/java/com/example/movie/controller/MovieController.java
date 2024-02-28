package com.example.movie.controller;

import com.example.movie.model.*;
import com.example.movie.repository.*;
import com.example.movie.service.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    public MovieJpaService movieService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return movieService.getMovieById(movieId);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return movieService.updateMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        movieService.deleteMovie(movieId);
    }
}