package com.cub.foodbuddy.model;

import java.util.ArrayList;


public class Filter {
	
	/* Attributes */
	private ArrayList<String> paymentType; 
	private ArrayList<String> services;
	private ArrayList<String> cuisinesOffered;
	private ArrayList<String> mealType;
	private ArrayList<String> dietRestrictions;

	/* Methods */
	
	public Filter(ArrayList<String> paymentType, ArrayList<String> services, ArrayList<String> cuisinesOffered,
			ArrayList<String> mealType, ArrayList<String> dietRestrictions) {
		this.paymentType = paymentType;
		this.services = services;
		this.cuisinesOffered = cuisinesOffered;
		this.mealType = mealType;
		this.dietRestrictions = dietRestrictions;
	}
	
	public Filter() {
		
	}

	public ArrayList<String> getPaymentType() {}
  
	public void setPaymentType(ArrayList<String> paymentType) {}
	
	public ArrayList<String> getServices() {}
  
	public void setServices(ArrayList<String> services) {}
	
	public ArrayList<String> getCuisinesOffered() {}
  
	public void setCuisinesOffered(ArrayList<String> cuisinesOffered) {}
	
	public ArrayList<String> getMealType() {}
  
	public void setMealType(ArrayList<String> mealType) {}
	
	public ArrayList<String> getDietRestrictions() {}
  
	public void setDietRestrictions(ArrayList<String> dietRestrictions) {}
}
