package com.cub.foodbuddy.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.repository.FilterRepository;

@Component
public class FilterDbSeeder implements CommandLineRunner{
	
	private FilterRepository filterRepository;

	@Autowired
	public FilterDbSeeder(FilterRepository filterRepository) {
		this.filterRepository = filterRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Filter> filter = new ArrayList<Filter> ();
		ArrayList<String> paymentType = new ArrayList<String>(); 
		ArrayList<String> services = new ArrayList<String>();
		ArrayList<String> cuisinesOffered = new ArrayList<String>(); 
		ArrayList<String> mealType = new ArrayList<String>(); 
		ArrayList<String> dietRestrictions = new ArrayList<String>();
		
		paymentType.add("Cash");
		services.add("Wifi");
		cuisinesOffered.add("Mediterranean");
		cuisinesOffered.add("Indian");
		mealType.add("");
		dietRestrictions.add("Vegeterian");
		
		filter.add(new Filter("alex@gmail.com", paymentType, services, cuisinesOffered, 
				mealType, dietRestrictions, 10));
		
		filterRepository.saveAll(filter);
		
	}
}
