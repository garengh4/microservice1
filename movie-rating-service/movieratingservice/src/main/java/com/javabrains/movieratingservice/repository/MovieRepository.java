package com.javabrains.movieratingservice.repository;

import com.javabrains.movieratingservice.models.Movie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{
  
}
