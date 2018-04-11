package com.cub.foodbuddy.manager;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RecommendationManager {

	private List<String> recommendationList= List.of("Cheese Cake Factory", "Panda Express");
	
	public List<String> getRecommendation(String email) {
		return recommendationList;
	}
}