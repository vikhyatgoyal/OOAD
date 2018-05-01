package com.cub.foodbuddy.model;

import javax.persistence.Column;
import javax.persistence.Embedded;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Host")
public class Host extends Profile{
	/* Attributes */

	private ArrayList<String> feedback;
	private Map<String,Integer> timeSlots;
	
	public int starRatings;
	private Filter services;

	public Host() {
		super();
	}
	
	

	public void updateServices(Filter service) {
		this.services = service;
	}
	
	public Filter getServices() {
		return this.services;
	}
	
	
	public void setStarRating(int starRating) {
		this.starRatings = starRating;
	}
	
	public int getStarRating() {
		return this.starRatings;
	}
	
}
