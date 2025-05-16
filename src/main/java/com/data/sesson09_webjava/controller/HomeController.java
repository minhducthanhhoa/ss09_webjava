package com.data.sesson09_webjava.controller;

import com.data.sesson09_webjava.model.Movie;
import com.data.sesson09_webjava.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private MovieService movieService = new MovieService();

    @GetMapping("/")
    public String showHome(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "home";
    }

    @GetMapping("/detailMovie")
    public String showDetail(@RequestParam("id") Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        if (movie != null) {
            model.addAttribute("movie", movie);
            return "detailMovie";
        }
        return "redirect:/";
    }
}
