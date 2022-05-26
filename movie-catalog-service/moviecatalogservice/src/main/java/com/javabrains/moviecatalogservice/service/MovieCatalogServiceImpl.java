package com.javabrains.moviecatalogservice.service;

import java.util.List;
import java.util.stream.Collectors;

import com.javabrains.moviecatalogservice.exception.MovieException;
import com.javabrains.moviecatalogservice.models.CatalogItem;
import com.javabrains.moviecatalogservice.models.MovieInfo;
import com.javabrains.moviecatalogservice.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

  @Autowired // consumer, while @Bean is producer
  private RestTemplate restTemplate;

  @Override
  public List<CatalogItem> getCatalog(Integer userId) throws MovieException {

    User user = restTemplate.getForObject("http://movie-rating-service/ratingsdata/users/" + userId, User.class);

    List<CatalogItem> result = user.getUserRatedMovies().stream().map(rating -> {
      MovieInfo movieInfo = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
          MovieInfo.class);
      CatalogItem catalogItem = new CatalogItem();
      catalogItem.setMovieId(movieInfo.getMovieId());
      catalogItem.setMovieTitle(movieInfo.getMovieTitle());
      catalogItem.setMovieDescription(movieInfo.getMovieDescription());
      catalogItem.setReleaseYear(movieInfo.getReleaseYear());
      catalogItem.setDirectedBy(movieInfo.getDirectedBy());

      catalogItem.setUserId(userId);
      catalogItem.setRating(rating.getRating());

      return catalogItem;
    }).collect(Collectors.toList());

    return result;
  }

}
