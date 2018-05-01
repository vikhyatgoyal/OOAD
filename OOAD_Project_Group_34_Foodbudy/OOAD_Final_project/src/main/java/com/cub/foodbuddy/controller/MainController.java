package com.cub.foodbuddy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "Welcome to FoodBuddy";
	}
	
}
