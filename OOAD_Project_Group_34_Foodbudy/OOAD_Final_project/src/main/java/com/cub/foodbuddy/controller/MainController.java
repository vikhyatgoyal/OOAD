package com.cub.foodbuddy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cub.foodbuddy.manager.FilterManager;
import com.cub.foodbuddy.manager.ProfileManager;
import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.model.Profile;


@RestController
public class MainController {
    @Autowired
    private ProfileManager profileManager;
	
    @Autowired
    private FilterManager filterManager;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "Welcome to FoodBuddy";
	}
	@RequestMapping(value="/endUser/profiles/addFilter/{email}", method = RequestMethod.POST)
	public void addDefaultEndUserFilter(@RequestBody Filter filter, @PathVariable String email) {
		EndUser profile = (EndUser) profileManager.getProfileByEmail(email);
		profileManager.addDefaultEndUserFilter(profile, filter);
		profileManager.editEndUserProfile(profile, email);
	}
	
}
