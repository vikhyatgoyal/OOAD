package com.cub.foodbuddy.model;

//import java.util.ArrayList;
//import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Host extends Profile implements ModifyProfile{
	/* Attributes */
//	private ArrayList< ArrayList<String> > menu;
//	private ArrayList<String> promotions; 
//	private ArrayList<String> feedback;
//	private String address;
//	private Map<String,Integer> timeSlots;
	
//	public int starRatings;

	public Host() {
		super();
	}
	
	public Host(String name, String email, String password, String mobile, String type)
	{
		super(name, email, password, mobile, type);
	}
	
		/* Interface methods */
	//@Override
	//public void addProfile(ArrayList< ArrayList<String> > menu, String promotions, String feedback, String address, int starRatings, Map<String, Integer> timeSlots) {
		
	//}
	
	//@Override
	//public void editProfile() {
		
	//}
	
//	public void updateHostProfile(Map< String, ArrayList<String> > hostProfile) {
//		
//	}
//	
//	public void updatePromotion(ArrayList<String> promos) {
//		
//	}
//	
//	public void updateServices(ArrayList<String> service) {
//		
//	}
//	
//	public void updateMenu(ArrayList< ArrayList<String> > menu) {
//		
//	}
//	
//	public void updateAvailability(ArrayList<String> availability) {
//		
//	}
//	
//	public int findRating(String restName) {
//		return 0;
//	}
//	
//	public void notifyHost(String userTimeSlot, String email) {
//		
//	}
	
}
