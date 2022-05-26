package com.javabrains.moviecatalogservice.models;

public class MovieInfo {

  private Integer movieId;
  private String movieTitle;
  private String releaseYear;
  private String directedBy;
  private String movieDescription;
  private Integer userId;
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

  public String getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(String releaseYear) {
    this.releaseYear = releaseYear;
  }

  public String getDirectedBy() {
    return directedBy;
  }

  public void setDirectedBy(String directedBy) {
    this.directedBy = directedBy;
  }

  public String getMovieDescription() {
    return movieDescription;
  }

  public void setMovieDescription(String movieDescription) {
    this.movieDescription = movieDescription;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

}
