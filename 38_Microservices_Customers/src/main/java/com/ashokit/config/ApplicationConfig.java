package com.ashokit.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public ModelMapper getModelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper;
	}
	
	@Bean
	//@LoadBalanced
	public RestTemplate getRestTemplateObject() {
		return new RestTemplate();
	}
	
    @Bean
    WebClient webClient(WebClient.Builder builder) {
        return builder.build();
    }
    
    /* @Bean
  	public Sampler alwaysSampler() {
  		return Sampler.ALWAYS_SAMPLE;
  	}  
  	@Bean
    //@LoadBalanced
    WebClient.Builder builder() {
        return WebClient.builder();
    }*/

}