package com.javabrains.movieratingservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_rating")
public class Movie {

  @Id
  @Column(name = "movie_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer movieId;

  @Column(name = "movie_title")
  private String movieTitle;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "user_rating")
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
