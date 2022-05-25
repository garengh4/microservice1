package com.javabrains.movieratingservice.dto;

public class MovieDTO {
  private Integer movieId;
  private String movieTitle;
  private String rating;
  
  public Integer getMovieId() {
    return movieId;
  }
  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }
  public String getMovieTitle() {
    return movieTitle;
  }
  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }
  public String getRating() {
    return rating;
  }
  public void setRating(String rating) {
    this.rating = rating;
  }

  
}
