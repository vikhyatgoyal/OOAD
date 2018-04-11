package com.cub.foodbuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cub.foodbuddy.manager.ProfileManager;
import com.cub.foodbuddy.model.Profile;

@RestController
public class MainController {
	
	@Autowired
    private ProfileManager profileManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "Welcome to FoodBuddy";
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Profile> getAllProfiles() {
		return profileManager.getAllProfiles();
	}

	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public Profile getProfileByEmail(@PathVariable String email) {
		//return profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		return profileManager.getProfileByEmail(email);
	}

	@RequestMapping(value="/add", method = RequestMethod.POST)
	public List<Profile> addProfile(@RequestBody Profile profile) {
		return profileManager.addProfile(profile);
	}

	@RequestMapping(value="/delete/{email}", method = RequestMethod.GET)
	public List<Profile> deleteProfile(@PathVariable String email) {
		return profileManager.deleteProfile(email);
	}
}
