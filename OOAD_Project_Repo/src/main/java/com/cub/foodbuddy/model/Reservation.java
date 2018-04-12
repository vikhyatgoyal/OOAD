package com.cub.foodbuddy.model;
import java.util.Map;

public class Reservation {
	private String date;
	private Map <String, Integer> availSlots;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Map<String, Integer> getAvailSlots() {
		return availSlots;
	}
	public void setAvailSlots(Map<String, Integer> availSlots) {
		this.availSlots = availSlots;
	}
	
	// Methods not implemented yet 
//	 public Map<String, Integer> getAvailability(String restName){
//		 
//	 }
//	 
//	 public void makeReservation(String restName, String userTimeSlot, String email) {
//		 
//	 }
	
}
