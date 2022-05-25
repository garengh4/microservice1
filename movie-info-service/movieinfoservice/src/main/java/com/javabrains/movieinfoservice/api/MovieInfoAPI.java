package com.javabrains.movieinfoservice.api;

import com.javabrains.movieinfoservice.dto.MovieDTO;
import com.javabrains.movieinfoservice.exception.MovieException;
import com.javabrains.movieinfoservice.models.Movie;
import com.javabrains.movieinfoservice.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoAPI {
  
  @Autowired
  private MovieService movieService;
  // @RequestMapping("/{movieId}")
  // public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
  //   return new Movie(movieId, "test movie name");
  // }

  @GetMapping("/{movieId}")
  public MovieDTO getMovieInfo(@PathVariable("movieId") Integer movieId) throws MovieException {
    MovieDTO returned = movieService.getMovieInfo(movieId);
    return returned;
  }
  
}
