package com.javabrains.moviecatalogservice.service;

import java.util.List;

import com.javabrains.moviecatalogservice.exception.MovieException;
import com.javabrains.moviecatalogservice.models.CatalogItem;

import org.springframework.stereotype.Component;

@Component
public interface MovieCatalogService {
  List<CatalogItem> getCatalog(Integer userId) throws MovieException;
}
