package com.cub.foodbuddy.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Admin;
import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Host;
import com.cub.foodbuddy.model.Profile;
import com.cub.foodbuddy.repository.ProfileRepository;

@Component
public class ProfileDbSeeder implements CommandLineRunner{

	private ProfileRepository profileRepository;
	
	public ProfileDbSeeder(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Profile> profiles = new ArrayList<> ();
		
		profiles.add(new EndUser("Alex", "alex@gmail.com", "alex", "12345", "endUser"));
		profiles.add(new EndUser("Bob", "bob@gmail.com", "bob", "12345", "endUser"));
		profiles.add(new EndUser("Cassie", "cassie@gmail.com", "cassie", "12345", "endUser"));
		profiles.add(new Host("Hunter", "hunter@gmail.com", "hunter", "23451", "host"));
		profiles.add(new Admin("Eddie", "eddie@gmail.com", "eddie", "25341", "admin"));
		profiles.add(new Host("Jack", "jack@gmail.com", "jack", "24351", "host"));
		
		profileRepository.saveAll(profiles);
	}
	
}
