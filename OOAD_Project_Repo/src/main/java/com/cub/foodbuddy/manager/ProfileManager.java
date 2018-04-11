package com.cub.foodbuddy.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Profile;
import com.cub.foodbuddy.repository.ProfileRepository;

@Component
public class ProfileManager {

	private ProfileRepository profileRepository;
	
	@Autowired
	public ProfileManager(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	public List<Profile> getAllProfiles() {
		return profileRepository.findAll();
	}
	
	public Profile getProfileByEmail(String email) {
		//return profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		return profileRepository.findByEmail(email);
	}
	
	public List<Profile> addProfile(Profile profile) {
		profileRepository.save(profile);
		return profileRepository.findAll();
	}
	
	public List<Profile> deleteProfile(String email) {
		profileRepository.deleteById(email);
		return profileRepository.findAll();
	}
	
}
