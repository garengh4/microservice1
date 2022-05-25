package com.javabrains.movieratingservice.service;

import com.javabrains.movieratingservice.dto.MovieDTO;
import com.javabrains.movieratingservice.dto.UserDTO;
import com.javabrains.movieratingservice.exception.MovieException;
import com.javabrains.movieratingservice.exception.UserException;

import org.springframework.stereotype.Component;

@Component
public interface MovieRatingService {
  MovieDTO addRatingForMovie(String movieId, int rating) throws MovieException;

  UserDTO getAllRatedMovies(Integer userId) throws UserException;
  MovieDTO getRatingForMovie(Integer movieId) throws MovieException;

  MovieDTO updateRatingForMovie(int userId, String movieId, int rating) throws MovieException;

  void deleteRatingForMovie(int userId, String movieId) throws MovieException;

}
