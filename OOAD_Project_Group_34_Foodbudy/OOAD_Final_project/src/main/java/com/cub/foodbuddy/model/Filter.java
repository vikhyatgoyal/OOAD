package com.cub.foodbuddy.model;

import java.util.ArrayList;

import javax.persistence.Embeddable;

@Embeddable
public class Filter {
	
	/* Attributes */
	private ArrayList<String> paymentType; 
	private ArrayList<String> services;
	private ArrayList<String> cuisinesOffered;
	private ArrayList<String> mealType;
	private ArrayList<String> dietRestrictions;
//	private String priceRange;

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

	public ArrayList<String> getPaymentType() {
		return paymentType;
	}
  
	public void setPaymentType(ArrayList<String> paymentType) {
		this.paymentType = paymentType;
	}
	
	public ArrayList<String> getServices() {
		return services;
	}
  
	public void setServices(ArrayList<String> services) {
		this.services = services;
	}
	
	public ArrayList<String> getCuisinesOffered() {
		return cuisinesOffered;
	}
  
	public void setCuisinesOffered(ArrayList<String> cuisinesOffered) {
		this.cuisinesOffered = cuisinesOffered;
	}
	
	public ArrayList<String> getMealType() {
		return mealType;
	}
  
	public void setMealType(ArrayList<String> mealType) {
		this.mealType = mealType;
	}
	
	public ArrayList<String> getDietRestrictions() {
		return dietRestrictions;
	}
  
	public void setDietRestrictions(ArrayList<String> dietRestrictions) {
		this.dietRestrictions = dietRestrictions;
	}
}
