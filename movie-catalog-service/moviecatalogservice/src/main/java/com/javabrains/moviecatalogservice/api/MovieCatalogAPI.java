package com.javabrains.moviecatalogservice.api;

import java.util.List;

import com.javabrains.moviecatalogservice.exception.MovieException;
import com.javabrains.moviecatalogservice.models.CatalogItem;
import com.javabrains.moviecatalogservice.service.MovieCatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogAPI {

  @Autowired
  private MovieCatalogService movieCatalogService;

  @GetMapping("/{userId}")
  public List<CatalogItem> getCatalog(@PathVariable("userId") Integer userId) throws MovieException {
    List<CatalogItem> returned = movieCatalogService.getCatalog(userId);
    return returned;
  }

}
