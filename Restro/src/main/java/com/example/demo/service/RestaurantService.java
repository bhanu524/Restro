package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.RestroRepository;
import com.example.model.Restaurants;

@Service
public class RestaurantService {

	@Autowired
	RestroRepository restroRepository;
	
	public Restaurants addRestaurant(Restaurants restaurants)
	{
		
		return restroRepository.save(restaurants);
	}
	
	public List<Restaurants> getAllRestaurants()
	{
		return (List<Restaurants>) restroRepository.findAll();
	}
	public Restaurants getRestaurantById(long id)
	{
		Optional<Restaurants> restaurants= restroRepository.findById(id);
		return restaurants.get();
	}
}
