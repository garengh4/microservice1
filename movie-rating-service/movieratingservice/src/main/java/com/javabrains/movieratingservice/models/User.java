package com.javabrains.movieratingservice.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer userId;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id" )
  private List<Movie> userRatedMovies;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public List<Movie> getUserRatedMovies() {
    return userRatedMovies;
  }

  public void setUserRatedMovies(List<Movie> userRatedMovies) {
    this.userRatedMovies = userRatedMovies;
  }

}
