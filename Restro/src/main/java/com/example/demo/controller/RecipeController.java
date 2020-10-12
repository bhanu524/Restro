package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.RecipeRepository;
import com.example.demo.repository.RestroRepository;
import com.example.demo.service.RecipeService;
import com.example.model.Recipes;

@RestController
public class RecipeController {

	@Autowired
	RestroRepository restroRepository;
	
	@Autowired
	RecipeRepository recipeRepository;
	
	@Autowired
	RecipeService recipeService;
	
	@PostMapping("/addRecipes")
    public Recipes addRecipes(@RequestBody Recipes recipes) {
		
        return recipeService.addRecipes(recipes);
    }
	@GetMapping("/getRecipes")
    public ResponseEntity<List<Recipes>> getAllRecipes() {
 
        List<Recipes> recipes = recipeService.getAllRecipes();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }
	@GetMapping("/getRecipes/{restaurantId}")
    public Recipes getRecipesByRestaurant(@PathVariable long restaurantId)   {
 
        Optional<Recipes> recipes = recipeRepository.findById(restaurantId);
        return recipes.get();
    }
}
