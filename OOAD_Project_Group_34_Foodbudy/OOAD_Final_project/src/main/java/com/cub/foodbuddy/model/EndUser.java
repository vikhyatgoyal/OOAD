package com.cub.foodbuddy.model;

import java.util.List;



//import java.util.ArrayList;
//import java.util.Map;

//import org.springframework.web.bind.annotation.RequestBody;

public class EndUser extends Profile{
	
	/* Attributes */
	@Transient
	@Column(name="feedback", nullable = true)
	private Feedback feedback;
	@Embedded
	@Column(name="filter", nullable = true)
	private Filter filter;
	
	
	/* Methods */
	/* Constructor */
	public EndUser(String name, String email, String password, String mobile, String type
//			, @RequestBody ArrayList<String> prefCuisine, @RequestBody Feedback feedback
			) 
	{
		super(name, email, password, mobile, type);
		//this.prefCuisine = prefCuisine;
	}
	
	public EndUser() {
		super();
	}
	
	public void updateFilters(Filter filter) {
		this.filter = filter;
	}
	
	public Filter getFilter() {
		return this.filter;
	}
	
	public void editProfile(EndUser endUserProfile) {
		this.setName(endUserProfile.getName());
		this.setMobile(endUserProfile.getMobile());
		this.setPassword(endUserProfile.getPassword());
		
		this.filter = endUserProfile.filter;
	}
	
//	public ArrayList< Map<String, String> > updateFilterAndGetRec(Filter filter){
//		
//	}
//	
//	public void giveFeedback(Feedback feedback) {
//		
//	}
//	
//	public void notifyEndUser() {
//		
//	}
	
}
