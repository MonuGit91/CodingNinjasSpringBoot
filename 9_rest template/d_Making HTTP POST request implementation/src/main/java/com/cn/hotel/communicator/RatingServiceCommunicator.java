package com.cn.hotel.communicator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingServiceCommunicator {

	
	private final RestTemplate restTemplate;
	
	@Autowired
	public RatingServiceCommunicator(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate=restTemplateBuilder.build();
	}
	
	public long getRating(String id)
	{
		String url ="http://localhost:8081/rating/id/";
		
		//ResponseEntity<Long> response= restTemplate.getForEntity(url+id, Long.class);
		Long ratingResponse = restTemplate.getForObject(url+id, Long.class);

		return ratingResponse;
	}

	public void addRating(Map<String, Long> ratingsMap) {
		
		String url ="http://localhost:8081/rating/add";
		
		restTemplate.postForObject(url, ratingsMap, Object.class);

	}

}
