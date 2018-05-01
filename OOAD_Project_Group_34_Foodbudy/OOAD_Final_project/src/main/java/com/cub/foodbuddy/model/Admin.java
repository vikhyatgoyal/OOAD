package com.cub.foodbuddy.model;

import java.util.ArrayList;

public class Admin extends Profile{
	/* Attributes */
	
	private ArrayList<String> advertisements = new ArrayList<>();
	
	public Admin() {
		
	}
	
	public Admin(String name, String email, String password, String mobile, String type){
		super(name, email, password, mobile, type);
	}
	
	public void deleteProfile(String email) {
		
	}
	
	public void setAdvertisement(String advertisement) {
		this.advertisements.add(advertisement);
	}
	
	public ArrayList<String> getAdvertisement() {
		return this.advertisements;
	}
	
//	public void setTheme(String theme) {
//		
//	}
}
