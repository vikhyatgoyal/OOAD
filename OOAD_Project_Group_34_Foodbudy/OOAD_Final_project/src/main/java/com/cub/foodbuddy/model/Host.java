package com.cub.foodbuddy.model;

import javax.persistence.Column;
import javax.persistence.Embedded;

public class Host extends Profile{
	/* Attributes */
//	private ArrayList<String> promotions;
//	private ArrayList<String> feedback;
//	private Map<String,Integer> timeSlots;
	
	public int starRatings;
	@Embedded
	@Column(name="filter", nullable = true)
	private Filter services;
	@Embedded
	@Column(name="menu", nullable = true)
	private Menu menu;

	public Host() {
		super();
	}
	
	public Host(String name, String email, String password, String mobile, String type)
	{
		super(name, email, password, mobile, type);
	}
	
	public void editProfile(Host hostProfile) {
		this.setName(hostProfile.getName());
		this.setMobile(hostProfile.getMobile());
		this.setPassword(hostProfile.getPassword());
		
	}
	
//	public void updateHostProfile(Map< String, ArrayList<String> > hostProfile) {
//		
//	}
//	
//	public void updatePromotion(ArrayList<String> promos) {
//		
//	}
//	
	public void updateServices(Filter service) {
		this.services = service;
	}
	
	public Filter getServices() {
		return this.services;
	}
	
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public Menu getMenu() {
		return this.menu;
	}
	
//	
//	public void updateAvailability(ArrayList<String> availability) {
//		
//	}
//	
//	
//	public void notifyHost(String userTimeSlot, String email) {
//		
//	}
	
	public void setStarRating(int starRating) {
		this.starRatings = starRating;
	}
	
	public int getStarRating() {
		return this.starRatings;
	}
	
}
