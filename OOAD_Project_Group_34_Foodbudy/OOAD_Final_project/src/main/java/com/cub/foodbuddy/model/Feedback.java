package com.cub.foodbuddy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {
	
	/* Attributes */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String email;
	private String feedback;
	private int rating;
	private String date;
	private String name;
	
	public Feedback() {
	
	}
	
	public Feedback(String email, String feedback, int rating, String date, String name) {
		this.email = email;
		this.feedback = feedback;
		this.rating = rating;
		this.date = date;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setRestuarantName(String name) {
		this.name = name;
	}
}
