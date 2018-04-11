package com.cub.foodbuddy.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Profile;
import com.cub.foodbuddy.repository.ProfileRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner{

	private ProfileRepository profileRepository;
	
	public DatabaseSeeder(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Profile> profiles = new ArrayList<> ();
		
		profiles.add(new Profile("Alex", "alex@gmail.com", "alex", "12345"));
		profiles.add(new Profile("Bob", "bob@gmail.com", "bob", "12345"));
		profiles.add(new Profile("Cassie", "cassie@gmail.com", "cassie", "12345"));
		
		profileRepository.saveAll(profiles);
	}
	
}
