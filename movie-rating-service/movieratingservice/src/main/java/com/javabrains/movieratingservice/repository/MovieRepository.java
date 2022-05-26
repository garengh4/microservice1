package com.javabrains.movieratingservice.repository;

import com.javabrains.movieratingservice.models.Rating;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Rating, Integer>{
  
}
