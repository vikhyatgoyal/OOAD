package com.cub.foodbuddy.model;

//import java.util.ArrayList;
//import java.util.Map;

//import org.springframework.web.bind.annotation.RequestBody;

public class Enduser extends Profile{
	
	/* Attributes */
//	private ArrayList<String> prefCuisine;
//	private Feedback feedback;
	
	/* Methods */
	/* Constructor */
	public Enduser(String name, String email, String password, String mobile
//			, @RequestBody ArrayList<String> prefCuisine, @RequestBody Feedback feedback
			) 
	{
		super(name, email, password, mobile);
		//this.prefCuisine = prefCuisine;
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
