package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Recipes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	long recipeId;
	String recipeName;
	@Column
	int priceOfTheRecipe;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private Restaurants restaurants;

	public Recipes() {

	}

	public Recipes(long recipeId, String recipeName, int priceOfTheRecipe, Restaurants restaurants) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.priceOfTheRecipe = priceOfTheRecipe;
		this.restaurants = restaurants;
	}

	public Restaurants getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Restaurants restaurants) {
		this.restaurants = restaurants;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getPriceOfTheRecipe() {
		return priceOfTheRecipe;
	}

	public void setPriceOfTheRecipe(int priceOfTheRecipe) {
		this.priceOfTheRecipe = priceOfTheRecipe;
	}

}
