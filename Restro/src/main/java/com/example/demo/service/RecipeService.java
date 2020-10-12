package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.RecipeRepository;
import com.example.demo.repository.RestroRepository;
import com.example.model.Recipes;
import com.example.model.Restaurants;

@Service
public class RecipeService {

	@Autowired
	RecipeRepository recipeRepository;
	
	@Autowired
	RestroRepository restroRepository;
	public List<Recipes> getAllRecipes()
	{
		return (List<Recipes>) recipeRepository.findAll();
	}
	
	public Recipes addRecipes(Recipes recipe) {
		 
        Restaurants rest = restroRepository.findById(recipe.getRestaurants().getRestaurantId()).orElse(null);
        if (null == rest) {
            rest = new Restaurants();
        }
        rest.setRestaurantName(recipe.getRestaurants().getRestaurantName());
        recipe.setRestaurants(rest);
        return recipeRepository.save(recipe);
    }
	public Optional<Recipes> getRecipeByRestaurant(long restaurantId)
	{
		return recipeRepository.findByRestaurantId(restaurantId);
	}
}
