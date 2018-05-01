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
public class RecommendationManager implements Observer{

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
		
		rankMap = scoreHosts(endUserFilter, hosts, email);

		/* Check this */
		for(Map.Entry<Integer,Host> entry : rankMap.entrySet()) {
			Host host = entry.getValue();
			
			hostNames.add(host.getName());
		}
		
//		Iterator itr = rankMap.entrySet().iterator();
//		while (itr.hasNext()) {
//
//			Map.Entry pair = (Map.Entry)itr.next();
//			hostNames.add(pair.getValue().getClass().getName());
//		}

		return hostNames;
	}
	
	private TreeMap<Integer, Host> scoreHosts(Filter userFilter, List<Host> hosts, String email) {
		HashMap<Integer, Host> rankHMap = new HashMap<Integer, Host>();
		List<Feedback> userFeedbacks;
		List<Feedback> hostFeedbacks;

		userFeedbacks = dbManager.getFeedbackById(email);

		for (Host h : hosts)
		{
			hostFeedbacks = dbManager.getFeedbackByName(h.getName());

			int score = ((32/h.getServices().getCuisinesOffered().size()) * userFilter.getCuisinesOffered().size())
					+ ((16/h.getServices().getPaymentType().size()) * userFilter.getPaymentType().size())
					+ ((24/h.getServices().getServices().size()) * userFilter.getServices().size())
					+ ((8/h.getServices().getMealType().size()) * userFilter.getMealType().size())
					+ ((24/h.getServices().getDietRestrictions().size()) * userFilter.getDietRestrictions().size());

			int highestRating = 0;
			if (!userFeedbacks.isEmpty()) {
				for (Feedback u : userFeedbacks) {
					if (u.getName().equals(h.getName())) {
						if (u.getRating() > highestRating) {
							highestRating = u.getRating();
						}
	
					}
				}
			}
			score += highestRating;

			int highestHostRating = 0;
			if (!hostFeedbacks.isEmpty()) {
				for (Feedback hf : hostFeedbacks) {
					if (hf.getRating() > highestHostRating)
						highestHostRating = hf.getRating();
				}
			}
			
			score += highestHostRating;

			rankHMap.put(score, h);
		}

		TreeMap<Integer, Host> sortedRankHMap = new TreeMap<>(rankHMap);

		return sortedRankHMap;
	}
		@Override
		public void update(Observable arg0, Object arg1) {
		/* When we have a changeFilter request from the user, 
		 * we generate the new recommendation based on the updated 
		 * filters and save it to database 
		 */
		String email = ((FilterManager)arg0).getEmail();
		ArrayList<String> hostNameList = getRecommendation(email);

		Recommendation recommendation = new Recommendation(hostNameList, email);

		dbManager.saveRecommendationsToDb(recommendation);	
	}
	
}
