package com.cub.foodbuddy.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Feedback;
import com.cub.foodbuddy.repository.FeedbackRepository;

@Component
public class FeedbackDbSeeder implements CommandLineRunner{
	private FeedbackRepository feedbackRepository;

	public FeedbackDbSeeder(FeedbackRepository feedbackRepository) {
		this.feedbackRepository = feedbackRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		List<Feedback> feedback = new ArrayList<> ();

		feedback.add(new Feedback("alex@gmail.com", "Excellent", 5, "04/04/2018"));
		feedback.add(new Feedback("bob@gmail.com", "Good", 4, "04/05/2018"));

		feedbackRepository.saveAll(feedback);
	}
}
