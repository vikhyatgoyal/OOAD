package com.cub.foodbuddy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cub.foodbuddy.controller.ProfileFactory;
import com.cub.foodbuddy.model.Admin;
import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Host;
import com.cub.foodbuddy.model.Menu;
import com.cub.foodbuddy.model.Profile;

@Service
public class ProfileManager {

	private ProfileRepository profileRepository;
	
	@Autowired
	public ProfileManager(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	

	
	private List<Profile> profiles = new ArrayList<> (Arrays.asList(
			new EndUser("Alex", "alex@gmail.com", "alex", "12345", "endUser"),
			new EndUser("Bob", "bob@gmail.com", "bob", "12345", "endUser"),
			new EndUser("Cassie", "cassie@gmail.com", "cassie", "12345", "endUser"),
			new Host("Hunter", "hunter@gmail.com", "hunter", "23451", "host"),
			new Admin("Eddie", "eddie@gmail.com", "eddie", "25341", "admin"),
			new Host("Jack", "jack@gmail.com", "jack", "24351", "host")
			));
	
	
	public List<Profile> getAllProfiles() {
		return profileRepository.findAll();
		return profiles;	
	}
	
	public Profile getProfileByEmail(String email) {
		return profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		//return profileRepository.findByEmail(email);
	}
	
	
	public void deleteProfile(String email) {
		profileRepository.deleteById(email);
		return profileRepository.findAll();
		for (Profile profile : profiles)
		{
			if (profile.getEmail().equals(email))
			{
				profiles.remove(profile);
			}
		}
		
	}
	
}
