package com.javabrains.movieinfoservice.repository;

import com.javabrains.movieinfoservice.models.MovieInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieInfo, Integer>{
  
}
