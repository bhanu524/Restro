package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RestaurantService;

import com.example.model.Restaurants;

@RestController
public class RestroController {

	@Autowired
	RestaurantService restaurantService;

	@PostMapping("/addRestaurants")
	public Restaurants insertRestaurants(@RequestBody Restaurants restaurants) {
		return restaurantService.addRestaurant(restaurants);
	}

	@GetMapping("/getAllRestaurants")
	public ResponseEntity<List<Restaurants>> getAllRestaurants() {

		List<Restaurants> restaurants = restaurantService.getAllRestaurants();
		return new ResponseEntity<>(restaurants, HttpStatus.OK);
	}
	@GetMapping("/getRestaurants/{id}")
	public Restaurants getRestaurantById(@PathVariable long id) {

		Restaurants restaurants = restaurantService.getRestaurantById(id);
		return restaurants;
	}
	
}