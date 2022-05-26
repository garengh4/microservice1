package com.javabrains.movieratingservice.service;

import java.util.ArrayList;
import java.util.List;

import com.javabrains.movieratingservice.dto.MovieDTO;
import com.javabrains.movieratingservice.dto.UserDTO;
import com.javabrains.movieratingservice.exception.MovieException;
import com.javabrains.movieratingservice.exception.UserException;
import com.javabrains.movieratingservice.models.Rating;
import com.javabrains.movieratingservice.models.User;
import com.javabrains.movieratingservice.repository.MovieRepository;
import com.javabrains.movieratingservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieRatingServiceImpl implements MovieRatingService {

  @Autowired
  private MovieRepository movieRepository;

  @Autowired
  private UserRepository userRepository;

  @Override
  public MovieDTO addRatingForMovie(String movieId, int rating) throws MovieException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UserDTO getAllRatedMovies(Integer userId) throws UserException {
    List<MovieDTO> result = new ArrayList<>();
    User user = userRepository.findById(userId)
        .orElseThrow(() -> new UserException("No user found with that userId."));

    List<Rating> movies = user.getUserRatedMovies();
    for(Rating current: movies) {
      MovieDTO dto = new MovieDTO();
      dto.setMovieId(current.getMovieId());
      dto.setRating(current.getRating());
      result.add(dto);
    }
    
    UserDTO userDTO = new UserDTO();
    userDTO.setUserId(userId);
    userDTO.setUserRatedMovies(result);
    return userDTO;
  }

  @Override
  public MovieDTO getRatingForMovie(Integer movieId) throws MovieException {
    Rating movie = movieRepository.findById(movieId)
        .orElseThrow(() -> new MovieException("No movie found with that movieId."));

    MovieDTO movieDTO = new MovieDTO();
    movieDTO.setMovieId(movie.getMovieId());
    movieDTO.setRating(movie.getRating());
    return movieDTO;
  }

  @Override
  public MovieDTO updateRatingForMovie(int userId, String movieId, int rating) throws MovieException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteRatingForMovie(int userId, String movieId) throws MovieException {
    // TODO Auto-generated method stub

  }

}
