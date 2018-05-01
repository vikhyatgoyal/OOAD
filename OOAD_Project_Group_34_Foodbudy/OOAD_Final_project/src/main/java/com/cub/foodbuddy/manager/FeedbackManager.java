package com.cub.foodbuddy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cub.foodbuddy.model.Feedback;

@Service
public class FeedbackManager {
	
//	private FeedbackRepository feedbackRepository;
//	
//	@Autowired
//	public FeedbackManager(FeedbackRepository feedbackRepository) {
//		this.feedbackRepository = feedbackRepository;
//	}
	
	@Autowired
	private DbManager dbManager;
	
//	private List<Feedback> feedbacks = new ArrayList<>(Arrays.asList(
//			new Feedback("alex@gmail.com", "Excellent", 5, "04/04/2018", "Tiffins"),
//			new Feedback("bob@gmail.com", "Good", 4, "04/05/2018", "Tiffins")
//			));
	
	public void giveFeedback(Feedback feedback, String email) {
//		feedbackRepository.save(feedback);
//		return feedbackRepository.findAll();
		
//		feedbacks.add(feedback);
		dbManager.saveFeedbacksToDb(feedback);
	}
}
