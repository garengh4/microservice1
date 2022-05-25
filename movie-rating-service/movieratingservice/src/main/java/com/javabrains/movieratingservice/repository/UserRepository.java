package com.javabrains.movieratingservice.repository;

import com.javabrains.movieratingservice.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
  
}
