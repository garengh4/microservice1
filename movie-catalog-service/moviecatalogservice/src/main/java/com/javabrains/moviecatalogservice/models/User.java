package com.javabrains.moviecatalogservice.models;

import java.util.List;

// TODO: how to combine User and UserRating?
// there is also a lot of redundancy: userId is everywhere?
public class User {

  private Integer userId;
  private List<UserRating> userRatedMovies;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public List<UserRating> getUserRatedMovies() {
    return userRatedMovies;
  }

  public void setUserRatedMovies(List<UserRating> userRatedMovies) {
    this.userRatedMovies = userRatedMovies;
  }

}
