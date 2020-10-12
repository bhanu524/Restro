package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Restaurants {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long restaurantId;
	@Column
	String restaurantName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private List<Recipes> recipes;
	
	public Restaurants() {

	}

	public Restaurants(long restaurantId, String restaurantName, List<Recipes> recipes) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.recipes = recipes;
	}


	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public List<Recipes> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipes> recipes) {
		this.recipes = recipes;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

}
