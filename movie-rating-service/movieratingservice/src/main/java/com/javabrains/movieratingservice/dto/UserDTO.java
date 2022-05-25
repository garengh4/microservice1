package com.javabrains.movieratingservice.dto;

import java.util.List;

public class UserDTO {
  private Integer userId;
  private List<MovieDTO> userRatedMovies;

  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public List<MovieDTO> getUserRatedMovies() {
    return userRatedMovies;
  }
  public void setUserRatedMovies(List<MovieDTO> userRatedMovies) {
    this.userRatedMovies = userRatedMovies;
  }
}
