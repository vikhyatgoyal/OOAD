package com.cub.foodbuddy.model;

import javax.persistence.Entity;

@Entity
public class Admin extends Profile{
	/* Attributes */
	
//	private String advertisement;
//	private String theme;
	
	public Admin() {
		
	}
	
	public Admin(String name, String email, String password, String mobile, String type){
		super(name, email, password, mobile, type);
	}
	
//	public void deleteProfile(String email) {
//		
//	}
//	
//	public void setAdvertisement(String advertisement) {
//		
//	}
//	
//	public void setTheme(String theme) {
//		
//	}
}
