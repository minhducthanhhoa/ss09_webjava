package com.data.sesson09_webjava.service;

import com.data.sesson09_webjava.model.Movie;
import com.data.sesson09_webjava.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository = new MovieRepository();

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id);
    }
}
