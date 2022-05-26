package com.javabrains.movieinfoservice.service;


import com.javabrains.movieinfoservice.dto.MovieDTO;
import com.javabrains.movieinfoservice.exception.MovieException;
import com.javabrains.movieinfoservice.models.MovieInfo;
import com.javabrains.movieinfoservice.repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieRepository movieRepository;

  @Override
  public MovieDTO getMovieInfo(Integer movieId) throws MovieException {
    MovieInfo movie = movieRepository.findById(movieId)
        .orElseThrow(() -> new MovieException("Cannot find movie with that movieId."));
    
    MovieDTO dto = new MovieDTO();
    dto.setMovieId(movieId);
    dto.setMovieTitle(movie.getMovieTitle());
    dto.setDirectedBy(movie.getDirectedBy());
    dto.setReleaseYear(movie.getReleaseYear());
    dto.setMovieDescription(movie.getMovieDescription());
    
    return dto;
  }

}
