package com.javabrains.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class MoviecatalogserviceApplication {

  @Bean         // create an instance of any spring object that can be shared across multiple class
  @LoadBalanced // allows for going to eureka server
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @Bean
  public WebClient.Builder getWebClientBuilder() {
    return WebClient.builder();
  }

	public static void main(String[] args) {
		SpringApplication.run(MoviecatalogserviceApplication.class, args);
	}

}
