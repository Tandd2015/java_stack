package com.codingdojo.pets.models;

public class Cat extends Animal {
	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		return "Meow, My name is " + this.name + ". I am a " + this.breed + " and my weight " + this.weight + " and i like you " +".";
	}
}
