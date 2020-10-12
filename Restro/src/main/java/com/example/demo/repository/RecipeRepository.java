package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Recipes;
@Repository
public interface RecipeRepository extends CrudRepository<Recipes, Long>{

	default Optional<Recipes> findByRestaurantId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
