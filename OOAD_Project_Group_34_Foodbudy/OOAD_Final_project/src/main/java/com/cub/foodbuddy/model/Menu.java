package com.cub.foodbuddy.model;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Embeddable;

@Embeddable
public class Menu {
	/* Attributes */
	private HashMap<String, ArrayList<String>> cuisines;

	public Menu() {
//		HashMap< String, ArrayList<String> > defaultMenu = new HashMap<String, ArrayList<String>>();
//		ArrayList<String> northIndianAL = new ArrayList<>();
//		ArrayList<String> southIndianAL = new ArrayList<>();
//		ArrayList<String> chineseAL = new ArrayList<>();
//		ArrayList<String> mediterraneanAL = new ArrayList<>();
//		ArrayList<String> mexicanAL = new ArrayList<>();
//		ArrayList<String> italianAL = new ArrayList<>();
//		
//		defaultMenu.put("North Indian", northIndianAL);
//		defaultMenu.put("South Indian", southIndianAL);
//		defaultMenu.put("Chinese", chineseAL);
//		defaultMenu.put("Mediterranean", mediterraneanAL);
//		defaultMenu.put("Mexican", mexicanAL);
//		defaultMenu.put("Italian", italianAL);
//		
//		setCuisines(defaultMenu);
	}	
	
	public HashMap<String, ArrayList<String>> getCuisines() {
		return cuisines;
	}

	public void setCuisines(HashMap<String, ArrayList<String>> cuisines) {
		this.cuisines = cuisines;
	}
}
