package com.cub.foodbuddy.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Feedback;
import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.model.Host;
import com.cub.foodbuddy.model.Recommendation;

@Service
public class RecommendationManager{

	@Autowired
	private DbManager dbManager;

	public ArrayList<String> getRecommendation(String email) {
		
		ArrayList<String> hostNames = new ArrayList<>();
		
		EndUser endUser; 
		Filter endUserFilter;
		List<Host> hosts;
		TreeMap<Integer, Host> rankMap;
		
		/* 1. Get user profile 
		 * 2. Extract user filters 
		 * 3. Get all the hosts
		 * 4. Score hosts depending on filter and take top 5
		 * 5. Sort host list depending on user feedback ratings 
		 * 6. Sort host list depending on host feedback rating 
		 * 7. Return top 5 host names */

		endUser = (EndUser) dbManager.getProfileByEmail(email);

		endUserFilter = endUser.getFilter();

		hosts = dbManager.getAllHostProfiles();

		return hostNames;
	}
}
