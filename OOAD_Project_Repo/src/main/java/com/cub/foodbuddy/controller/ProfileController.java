package com.cub.foodbuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cub.foodbuddy.model.Profile;
import com.cub.foodbuddy.repository.ProfileRepository;

@RestController
@RequestMapping(value = "/profiles")
public class ProfileController {

	private ProfileRepository profileRepository;
	
	@Autowired
	public ProfileController(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayHomePage() {
		return "Welcome to FoodBuddy";
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Profile> getAllProfiles() {
		return profileRepository.findAll();
	}
	
	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public Profile getProfileByEmail(@PathVariable String email) {
		//return profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		return profileRepository.findByEmail(email);
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public List<Profile> addProfile(@RequestBody Profile profile) {
		profileRepository.save(profile);
		return profileRepository.findAll();
	}
	
	@RequestMapping(value="/delete/{email}", method = RequestMethod.GET)
	public List<Profile> deleteProfile(@PathVariable String email) {
		profileRepository.deleteById(email);
		return profileRepository.findAll();
	}
	
}
