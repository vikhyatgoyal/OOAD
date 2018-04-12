package com.cub.foodbuddy.repository;

import java.util.Iterator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cub.foodbuddy.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String>{

	Profile findByEmail(String email);
	Iterator<Profile> findByType(String type);
}
