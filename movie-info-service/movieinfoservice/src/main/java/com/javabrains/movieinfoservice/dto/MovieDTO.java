package com.javabrains.movieinfoservice.dto;

public class MovieDTO {
  private Integer movieId;
  private String movieTitle;
  private String releaseYear;
  private String directedBy;
  private String movieDescription;

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

}
