package com.cub.foodbuddy.model;

import java.util.List;

public class EndUser extends Profile{
	
  private Feedback feedback;
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

	
	public ArrayList< Map<String, String> > updateFilterAndGetRec(Filter filter){
		
	}
	
	public void giveFeedback(Feedback feedback) {
		
	}
	
	public void notifyEndUser() {
		
	}
	
}
