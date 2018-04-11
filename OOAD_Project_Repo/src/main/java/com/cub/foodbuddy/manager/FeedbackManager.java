package com.cub.foodbuddy.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Feedback;
import com.cub.foodbuddy.repository.FeedbackRepository;

@Component
public class FeedbackManager {
	
	private FeedbackRepository feedbackRepository;
	
	@Autowired
	public FeedbackManager(FeedbackRepository feedbackRepository) {
		this.feedbackRepository = feedbackRepository;
	}
	
	public void giveFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);
	}
	
	public List<Feedback> getFeedbacks() {
		return feedbackRepository.findAll();
	}
}
