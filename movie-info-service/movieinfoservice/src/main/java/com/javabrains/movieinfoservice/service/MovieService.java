package com.javabrains.movieinfoservice.service;

import com.javabrains.movieinfoservice.dto.MovieDTO;
import com.javabrains.movieinfoservice.exception.MovieException;

import org.springframework.stereotype.Component;

@Component
public interface MovieService {
  
  MovieDTO getMovieInfo(Integer movieId) throws MovieException;
}
