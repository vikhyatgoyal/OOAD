package com.cub.foodbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cub.foodbuddy.model.Filter;

public interface FilterRepository extends JpaRepository<Filter, String>{

	public Filter findByEmail(String email);
}
