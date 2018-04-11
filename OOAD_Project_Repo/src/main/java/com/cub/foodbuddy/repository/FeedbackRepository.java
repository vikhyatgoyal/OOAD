package com.cub.foodbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cub.foodbuddy.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, String>{
	
}
