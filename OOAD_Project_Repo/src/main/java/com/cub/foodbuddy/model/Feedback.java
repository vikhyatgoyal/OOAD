package com.cub.foodbuddy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	/* Attributes */
	@Id
	private String email;
	private String feedback;
	private int rating;
	private String date;
	
	public Feedback() {
		super();
	}
	
	public Feedback(String email, String feedback, int rating, String date) {
		super();
		this.email = email;
		this.feedback = feedback;
		this.rating = rating;
		this.date = date;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}