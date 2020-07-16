package com.codingdojo.pets.models;

public abstract class Animal implements Pet {
	
	// member variables
	protected String name;
	protected String breed;
	protected double weight;
	
	// getters
	public String getBreed() {
		return this.breed;
	}
	// constructor
	protected Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public abstract String showAffection();

}
