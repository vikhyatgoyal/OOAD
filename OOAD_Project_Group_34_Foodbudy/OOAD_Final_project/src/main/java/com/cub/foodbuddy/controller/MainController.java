package com.cub.foodbuddy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cub.foodbuddy.manager.DbManager;
import com.cub.foodbuddy.manager.FeedbackManager;
import com.cub.foodbuddy.manager.FilterManager;
import com.cub.foodbuddy.manager.ProfileManager;
import com.cub.foodbuddy.manager.RecommendationManager;
import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Feedback;
import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.model.Host;
import com.cub.foodbuddy.model.Menu;
import com.cub.foodbuddy.model.Profile;

@RestController
public class MainController {
	
	@Autowired
    private ProfileManager profileManager;
	
	@Autowired
    private FeedbackManager feedbackManager;
	
	@Autowired
    private FilterManager filterManager;
	
	@Autowired
	private RecommendationManager recommendationManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "Welcome to FoodBuddy";
	}
	
	@RequestMapping(value = "/profiles/display/all", method = RequestMethod.GET)
	public List<Profile> getAllProfiles() {
		return profileManager.getAllProfiles();
	}
	
	@RequestMapping(value = "/profiles/display/{type}", method = RequestMethod.GET)
	public List<Profile> getProfilesByType(@PathVariable String type) {
		return profileManager.getProfilesByType(type);
	}
	
	@RequestMapping(value = "/profiles/display/email/{email}", method = RequestMethod.GET)
	public Profile getProfileByEmail(@PathVariable String email) {
		return profileManager.getProfileByEmail(email);
	}

	@RequestMapping(value="/profiles/add/{type}", method = RequestMethod.POST)
	public void addProfile(@RequestBody ProfileFactory profileFactory, @PathVariable String type) {
		profileManager.addProfile(profileFactory, type);
	}
	
	@RequestMapping(value="/endUser/profiles/addFilter/{email}", method = RequestMethod.POST)
	public void addDefaultEndUserFilter(@RequestBody Filter filter, @PathVariable String email) {
		EndUser profile = (EndUser) profileManager.getProfileByEmail(email);
		profileManager.addDefaultEndUserFilter(profile, filter);
		profileManager.editEndUserProfile(profile, email);
	}
	
	@RequestMapping(value="/endUser/profiles/edit/{email}", method = RequestMethod.POST)
	public void editEndUserProfile(@RequestBody EndUser endUserprofile, @PathVariable String email) {
		profileManager.editEndUserProfile(endUserprofile, email);
	}
	
	@RequestMapping(value="/host/profiles/edit/{email}", method = RequestMethod.POST)
	public void editHostProfile(@RequestBody Host hostprofile, @PathVariable String email) {
		profileManager.editHostProfile(hostprofile, email);
	}
	
	@RequestMapping(value="/host/profiles/addServices/{email}", method = RequestMethod.POST)
	public void addDefaultHostServices(@RequestBody Filter filter, @PathVariable String email) {
		Host profile = (Host) profileManager.getProfileByEmail(email);
		profileManager.addDefaultHostServices(profile, filter);
		profileManager.editHostProfile(profile, email);
	}
	
	@RequestMapping(value="/host/profiles/addMenu/{email}", method = RequestMethod.POST)
	public void addMenu(@RequestBody Menu menu, @PathVariable String email) {
		Host profile = (Host) profileManager.getProfileByEmail(email);
		profileManager.addMenu(profile, menu);
		profileManager.editHostProfile(profile, email);
		/* TODO: Check the "Data Too Long" error */
	}

	@RequestMapping(value="/admin/profile/delete/{email}", method = RequestMethod.DELETE)
	public void deleteProfile(@PathVariable String email) {
		profileManager.deleteProfile(email);
	}
	
	@RequestMapping(value = "/admin/advertisement/add/{email}", method = RequestMethod.POST)
	public void addAdvertisement(@RequestBody String adv, @PathVariable String email) {
		profileManager.addAdvertisement(adv, email);
	}
	
	@RequestMapping(value = "/advertisement/display/{email}", method = RequestMethod.GET)
	public ArrayList<String> displayAdvertisement(@PathVariable String email) {
		return profileManager.displayAdvertisement(email);
	}
	
	@RequestMapping(value = "/endUser/recommendation/display/{email}", method = RequestMethod.GET)
	public List<String> getRecommendationList(@PathVariable String email) {
		/* This will internally call getRecommendation method of recommendationManager */
//		EndUser endUser = (EndUser) profileManager.getProfileByEmail(email);
		return recommendationManager.getRecommendation(email);
	}
	
//	@RequestMapping(value = "/endUser/recommendation/reset/{email}", method = RequestMethod.GET)
//	public List<String> resetRecommendation(@PathVariable String email) {
//		return recommendationManager.resetRecommendation(email);
//	}
	
	@RequestMapping(value = "/endUser/feedback/add/{email}", method = RequestMethod.POST)
	public void giveFeedback(@RequestBody Feedback feedback, @PathVariable String email){
		/* Figure out how to cleanly extract email information from POST request body and 
		 * use that as the id */
		feedbackManager.giveFeedback(feedback, email);
	}
	
	@RequestMapping(value = "/endUser/feedback/display/{email}", method = RequestMethod.GET)
	public List<Feedback> displayFeedback(@PathVariable String email){
		return feedbackManager.getFeedbackById(email);
	}
	
	@RequestMapping(value = "/host/feedback/display/{email}", method = RequestMethod.GET)
	public List<Feedback> displayHostFeedback(@PathVariable String email){
		Host profile = (Host) profileManager.getProfileByEmail(email);
		return feedbackManager.getFeedbackByName(profile.getName());
	}
	
	@RequestMapping(value = "/endUser/filter/display/{email}", method = RequestMethod.GET)
	public Filter displayUserFilterById(@PathVariable String email){
		/* Will call readDefaultFilter if needed */
		EndUser profile = (EndUser) profileManager.getProfileByEmail(email);
		return filterManager.getFilterById(profile);
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/endUser/filter/change/{email}", method = RequestMethod.POST)
	public List<String> setUserFilterById(@RequestBody Filter filter, @PathVariable String email){
		filterManager.addObserver(recommendationManager);
		EndUser profile = (EndUser) profileManager.getProfileByEmail(email);
		filterManager.setFilterById(profile, filter);
		return recommendationManager.displayAutoUpdatedRecListFromDb(email);
		
	}
	
	@RequestMapping(value = "/profiles/update/{email}", method = RequestMethod.POST)
	public void updateProfile(@RequestBody ProfileFactory profileFactory, @PathVariable String email){
		/* Based on the field of the host profile that needs to be changed, 
		 * the code can be internally implemented  */
		profileManager.updateProfile(profileFactory, email);
	}
	
	@RequestMapping(value = "/host/display/{email}", method = RequestMethod.GET)
	public Profile displayHostProfile(@PathVariable String email){
		/* Based on the field of the host profile that needs to be changed, 
		 * the code can be internally implemented  */
		return profileManager.getProfileByEmail(email);
	}
	
	@RequestMapping(value = "/endUser/display/{email}", method = RequestMethod.GET)
	public Profile displayEndUserProfile(@PathVariable String email){
		/* Based on the field of the host profile that needs to be changed, 
		 * the code can be internally implemented  */
		return profileManager.getProfileByEmail(email);
	}
	
	@RequestMapping(value = "/admin/display/{email}", method = RequestMethod.GET)
	public Profile displayAdminProfile(@PathVariable String email){
		/* Based on the field of the host profile that needs to be changed, 
		 * the code can be internally implemented  */
		return profileManager.getProfileByEmail(email);
	}
	
//	@RequestMapping(value = "/reservation/display/{email}", method = RequestMethod.GET)
//	public List<String> displayReservation(@PathVariable String email) {
//		return reservationManager.displayReservation(email);
//	}
	
//	@RequestMapping(value = "/endUser/reservation/make/{email}", method = RequestMethod.POST)
//	public void makeReservation(@RequestBody Reservation reservation, @PathVariable String email) {
//		reservationManager.makeReservation(reservation, email);
//		/* Call the notifyHost method inside from within the reservationManager */
//	}
	
//	@RequestMapping(value = "/reservation/timeslots/{email}", method = RequestMethod.GET)
//	public List<String> displayTimeSlots(@PathVariable String email) {
//		return profileManager.displayTimeSlots(email);
//	}
	
}
