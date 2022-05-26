package com.javabrains.movieinfoservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class MovieInfo {
  
  @Id
  @Column(name = "movie_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer movieId;

  @Column(name = "movie_title")
  private String movieTitle;

  @Column(name = "release_year")
  private String releaseYear;

  @Column(name = "directed_by")
  private String directedBy;

  @Column(name = "movie_description")
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
