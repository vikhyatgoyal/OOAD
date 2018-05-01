package com.cub.foodbuddy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.springframework.stereotype.Service;

import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Filter;

@SuppressWarnings("deprecation")
@Service
public class FilterManager extends Observable{
	
	private String email;
	
//	private FilterRepository filterRepository;
//	
//	@Autowired
//	public FilterManager(FilterRepository filterRepository) {
//		this.filterRepository = filterRepository;
//	}
	
//	List<Filter> filters = new ArrayList<>(Arrays.asList(
//			new Filter(new ArrayList<>(Arrays.asList("Cash")), 
//					new ArrayList<>(Arrays.asList("Wifi")),
//					new ArrayList<>(Arrays.asList("Indian", "Mediterranean")),                               
//					new ArrayList<>(Arrays.asList("")) ,
//					new ArrayList<>(Arrays.asList("Vegetarian")))
//			));
	
//	public Filter getFilterById(String email){
//		return filterRepository.findByEmail(email);
//	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Filter getFilterById(EndUser endUser){
		return endUser.getFilter();
	}
	
	public void setFilterById(EndUser endUser, Filter filter){
		endUser.updateFilters(filter);

		this.setEmail(endUser.getEmail());
	}
}
