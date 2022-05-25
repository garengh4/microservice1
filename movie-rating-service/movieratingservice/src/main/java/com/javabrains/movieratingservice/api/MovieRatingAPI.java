package com.javabrains.movieratingservice.api;

import com.javabrains.movieratingservice.dto.MovieDTO;
import com.javabrains.movieratingservice.dto.UserDTO;
import com.javabrains.movieratingservice.exception.MovieException;
import com.javabrains.movieratingservice.exception.UserException;
import com.javabrains.movieratingservice.service.MovieRatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class MovieRatingAPI {

  @Autowired
  MovieRatingService movieRatingService;

  @GetMapping("/{movieId}")
  public MovieDTO getRatingForMovie(@PathVariable("movieId") Integer movieId) throws MovieException {
    MovieDTO returned = movieRatingService.getRatingForMovie(movieId);
    return returned;
  } 

  @GetMapping("users/{userId}")
  public UserDTO getAllRatedMovies(@PathVariable("userId") Integer userId) throws UserException {
    UserDTO returned = movieRatingService.getAllRatedMovies(userId);
    return returned;
  }
}
