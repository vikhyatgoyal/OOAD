package com.cub.foodbuddy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cub.foodbuddy.controller.ProfileFactory;
import com.cub.foodbuddy.model.Admin;
import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.model.Host;
import com.cub.foodbuddy.model.Menu;
import com.cub.foodbuddy.model.Profile;

@Service
public class ProfileManager {

//	private ProfileRepository profileRepository;
//	
//	@Autowired
//	public ProfileManager(ProfileRepository profileRepository) {
//		this.profileRepository = profileRepository;
//	}
	
	@Autowired
	private DbManager dbManager;
	
//	private List<Profile> profiles = new ArrayList<> (Arrays.asList(
//			new EndUser("Alex", "alex@gmail.com", "alex", "12345", "endUser"),
//			new EndUser("Bob", "bob@gmail.com", "bob", "12345", "endUser"),
//			new EndUser("Cassie", "cassie@gmail.com", "cassie", "12345", "endUser"),
//			new Host("Hunter", "hunter@gmail.com", "hunter", "23451", "host"),
//			new Admin("Eddie", "eddie@gmail.com", "eddie", "25341", "admin"),
//			new Host("Jack", "jack@gmail.com", "jack", "24351", "host")
//			));
	
	
	public List<Profile> getAllProfiles() {
//		return profileRepository.findAll();
//		return profiles;
		return dbManager.getAllProfiles();
		
	}
	
	public Profile getProfileByEmail(String email) {
		//return profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
//		return profileRepository.findByEmail(email);
		
		return dbManager.getProfileByEmail(email);
	}
	
	public void addProfile(ProfileFactory profileFactory, String type) {
//		profileRepository.save(profile);
//		return profileRepository.findAll();
		if (type.equals("endUser"))
		{
			EndUser endUser = profileFactory.getEndUser();
//			profiles.add(endUser);
			dbManager.saveToDb(endUser);
		}
		else if (type.equals("host"))
		{
			Host host = (Host) profileFactory.getHost();
//			profiles.add(host);
			dbManager.saveToDb(host);
		}
		else if (type.equals("admin"))
		{
			Admin admin = (Admin) profileFactory.getAdmin();
//			profiles.add(admin);
			dbManager.saveToDb(admin);
		}
		
		return;
	}
	
	public void deleteProfile(String email) {
//		profileRepository.deleteById(email);
//		return profileRepository.findAll();
//		for (Profile profile : profiles)
//		{
//			if (profile.getEmail().equals(email))
//			{
//				profiles.remove(profile);
//			}
//		}
		
		dbManager.deleteProfile(email);
		
		/* Need to check if filter and feedback needs to be also deleted as well */
	}
	
	public List<Profile> getProfilesByType(String type) {
//		List<Profile> profile = new ArrayList<> ();
//		List<Profile> filteredProfile = new ArrayList<> ();
//		
//		profileRepository.findAll().
//		forEach(profile::add);
//		
//		for (int i = 0; i < profile.size(); i++) {
//			Profile p = profile.get(i);
//			if (p.getType().equals(type)) {
//				filteredProfile.add(p);
//			}
//		}
		
//		List<Profile> filteredProfile = new ArrayList<> ();
//
//		for (int i = 0; i < profiles.size(); i++) {
//			Profile p = profiles.get(i);
//			if (p.getType().equals(type)) {
//				filteredProfile.add(p);
//			}
//		}
//		
//		return filteredProfile;
		
		return dbManager.getProfilesByType(type);
	}
	
	public void editEndUserProfile(EndUser endUserProfile, String email)
	{
//		EndUser profileToEdit = (EndUser) profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		
		EndUser profileToEdit = dbManager.getEndUserFromDb(email);
		
		profileToEdit.setName(endUserProfile.getName());
		profileToEdit.setMobile(endUserProfile.getMobile());
		profileToEdit.setPassword(endUserProfile.getPassword());
		profileToEdit.updateFilters(endUserProfile.getFilter());
		
		dbManager.updateToDb(profileToEdit);
		
		/* Add changes for other fields of endUser */
	}
	
	public void editHostProfile(Host hostProfile, String email)
	{
//		Profile profileToEdit = profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		
		Host profileToEdit = dbManager.getHostFromDb(email);
		
		profileToEdit.setName(hostProfile.getName());
		profileToEdit.setMobile(hostProfile.getMobile());
		profileToEdit.setPassword(hostProfile.getPassword());
		profileToEdit.updateServices(hostProfile.getServices());
		profileToEdit.setStarRating(hostProfile.getStarRating());
		
		profileToEdit.setMenu(hostProfile.getMenu());
		
		dbManager.updateToDb(profileToEdit);
		
		/* Add changes for other fields of host */
	}
	
	public void addAdvertisement(String advertisement, String email) {
//		Profile profile = profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		
		Admin profile = (Admin) dbManager.getAdminFromDb(email);
		
		profile.setAdvertisement(advertisement);
		
		dbManager.updateToDb(profile);
	}
	
	public ArrayList<String> displayAdvertisement(String email) {
//		Profile profile = profiles.stream().filter(p -> p.getEmail().equals(email)).findFirst().get();
		Admin profile = (Admin) dbManager.getAdminFromDb(email);
		
		return profile.getAdvertisement();
	}
	
	public void addDefaultEndUserFilter(EndUser endUser, Filter filter) {
		
		endUser.updateFilters(filter);
	}
	
	public void updateProfile(ProfileFactory profileWrapper, String email) {
		List<Profile> profiles = getAllProfiles();
		
		for (Profile profile : profiles) {
			if (profile.getEmail().equals(email)) {
				if (profile.getType().equals("endUser")) {
					((EndUser)profile).editProfile(profileWrapper.getEndUser());
					dbManager.saveToDb(profile);
				}
				else if (profile.getType().equals("host")) {
					((Host)profile).editProfile(profileWrapper.getHost());
					dbManager.saveToDb(profile);
				}
			}
		}
	}
	
	public void addDefaultHostServices(Host host, Filter filter) {
		host.updateServices(filter);
	}
	
	public void addMenu(Host host, Menu menu) {
		host.setMenu(menu);
	}
}
