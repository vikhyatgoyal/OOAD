package com.cub.foodbuddy.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cub.foodbuddy.model.Filter;
import com.cub.foodbuddy.repository.FilterRepository;

@Component
public class FilterManager {
	
	private FilterRepository filterRepository;
	
	@Autowired
	public FilterManager(FilterRepository filterRepository) {
		this.filterRepository = filterRepository;
	}
	
	public Filter getFilterById(String email){
		return filterRepository.findByEmail(email);
	}
}
