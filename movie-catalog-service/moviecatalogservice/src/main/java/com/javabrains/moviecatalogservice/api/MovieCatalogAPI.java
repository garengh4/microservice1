package com.javabrains.moviecatalogservice.api;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.javabrains.moviecatalogservice.models.CatalogItem;
import com.javabrains.moviecatalogservice.models.Movie;
import com.javabrains.moviecatalogservice.models.Rating;
import com.javabrains.moviecatalogservice.models.UserRating;
import com.netflix.discovery.DiscoveryClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogAPI {

  @Autowired // consumer, while @Bean is producer
  private RestTemplate restTemplate;

  @Autowired
  private WebClient.Builder webClientBuilder;

  @Autowired
  private DiscoveryClient discoveryClient;

  @RequestMapping("/{userId}")
  public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

    // get all rated movie ids
    UserRating ratings = restTemplate.getForObject("http://movie-rating-service/ratingsdata/users/"+userId, UserRating.class); // we can move this url to the property file
    // for each movie id, call movie info service and get details

    // put them all together
    return ratings.getUserRatings().stream().map(rating -> {
      Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);

      return new CatalogItem(movie.getName(), "war between robots", rating.getRating());
    }).collect(Collectors.toList());

  }
}
