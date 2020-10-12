package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Restaurants;
@Repository
public interface RestroRepository extends JpaRepository<Restaurants,Long> {

	@Override
	public List<Restaurants> findAll();
	
	
	public List<Restaurants> findByrestaurantId(long restaurantId);
	
}
