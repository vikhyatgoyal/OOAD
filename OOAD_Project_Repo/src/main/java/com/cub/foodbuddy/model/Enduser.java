package com.cub.foodbuddy.model;

import javax.persistence.Entity;

//import java.util.ArrayList;
//import java.util.Map;

//import org.springframework.web.bind.annotation.RequestBody;

@Entity
public class EndUser extends Profile{
	
	/* Attributes */
//	private ArrayList<String> prefCuisine;
//	private Feedback feedback;
	
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
	
//	public void updateFilters(Filter filter) {
//	}
	
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
