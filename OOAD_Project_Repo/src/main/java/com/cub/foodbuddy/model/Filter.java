package com.cub.foodbuddy.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Filter {
	
	/* Attributes */
	@Id
	private String email;
	
	private ArrayList<String> paymentType; 
	private ArrayList<String> services;
	private ArrayList<String> cuisinesOffered;
	private ArrayList<String> mealType;
	private ArrayList<String> dietRestrictions;
	private int priceRange;
	
	/* Methods */
	
	public Filter(String email, ArrayList<String> paymentType, ArrayList<String> services, ArrayList<String> cuisinesOffered,
			ArrayList<String> mealType, ArrayList<String> dietRestrictions, int priceRange) {
		super();
		this.email = email;
		this.paymentType = paymentType;
		this.services = services;
		this.cuisinesOffered = cuisinesOffered;
		this.mealType = mealType;
		this.dietRestrictions = dietRestrictions;
		this.priceRange = priceRange;
	}
	
	public Filter() {
		super();
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
	
	public int getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	
}
