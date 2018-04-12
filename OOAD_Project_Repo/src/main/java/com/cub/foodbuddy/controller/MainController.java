package com.cub.foodbuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cub.foodbuddy.manager.FeedbackManager;
import com.cub.foodbuddy.manager.FilterManager;
import com.cub.foodbuddy.manager.ProfileManager;
import com.cub.foodbuddy.manager.RecommendationManager;
import com.cub.foodbuddy.model.Feedback;
import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.model.Profile;

@RestController
public class MainController {
	
	@Autowired
    private ProfileManager profileManager;
	
	@Autowired
    private RecommendationManager recommendationManager;
	
	@Autowired
    private FeedbackManager feedbackManager;
	
	@Autowired
    private FilterManager filterManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "Welcome to FoodBuddy";
	}
	
	@RequestMapping(value = "/profiles/all", method = RequestMethod.GET)
	public List<Profile> getAllProfiles() {
		return profileManager.getAllProfiles();
	}

	@RequestMapping(value = "/profiles/{email}", method = RequestMethod.GET)
	public Profile getProfileByEmail(@PathVariable String email) {
		//return profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		return profileManager.getProfileByEmail(email);
	}

	@RequestMapping(value="/profiles/add", method = RequestMethod.POST)
	public List<Profile> addProfile(@RequestBody Profile profile) {
		return profileManager.addProfile(profile);
	}

	@RequestMapping(value="/profiles/delete/{email}", method = RequestMethod.DELETE)
	public List<Profile> deleteProfile(@PathVariable String email) {
		return profileManager.deleteProfile(email);
	}
	
	@RequestMapping(value = "/profiles/{type}", method = RequestMethod.GET)
	public List<Profile> getProfilesByType(@PathVariable String type) {
		return profileManager.getProfilesByType(type);
	}
	
	@RequestMapping(value = "/recommendation/{email}", method = RequestMethod.GET)
	public List<String> getRecommendationList(@PathVariable String email) {
		/* This function is returning now a hardcoded list of recommendations. 
		 * The correct sequence of method invocations will be done to generate 
		 * the final recommendation list.*/
		return recommendationManager.getRecommendation(email);
	}
	
	@RequestMapping(value = "/feedback/add", method = RequestMethod.POST)
	public void giveFeedback(@RequestBody Feedback feedback){
		feedbackManager.giveFeedback(feedback);
	}
	
	@RequestMapping(value = "/feedback/all", method = RequestMethod.GET)
	public List<Feedback> getFeedbacks(){
		return feedbackManager.getFeedbacks();
	}
	
	@RequestMapping(value = "/filter/{email}", method = RequestMethod.GET)
	public Filter getFilterById(@PathVariable String email){
		return filterManager.getFilterById(email);
	}
}
