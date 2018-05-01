package com.cub.foodbuddy.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import java.util.ArrayList;
//import java.util.Map;
//import java.util.List;

@Entity
@Table(name="Recommendation")
public class Recommendation {
	/* Attributes */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String email;
	private ArrayList<String> hostNameList;
//	ArrayList<Feedback> hostFeedback;
	
	public Recommendation() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getHostNameList() {
		return hostNameList;
	}

	public void setHostNameList(ArrayList<String> hostNameList) {
		this.hostNameList = hostNameList;
	}
	
}
