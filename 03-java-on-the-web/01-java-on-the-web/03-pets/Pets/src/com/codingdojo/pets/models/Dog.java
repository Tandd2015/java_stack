package com.codingdojo.pets.models;

public class Dog extends Animal{
	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		if(weight <= 10) {
			return "Jump in lap!!! and Bark., My name is " + this.name + ". I am a " + this.breed + " and my weight " + this.weight + " and i like you " +".";
		} else if (weight >= 10 && weight <= 20) {
			return "Jump in lap!!!, My name is " + this.name + ". I am a " + this.breed + " and my weight " + this.weight + " and i like you " +".";
		} else {
			return "Bark , My name is " + this.name + ". I am a " + this.breed + " and my weight " + this.weight + " and i like you " +".";
		}
	}
}
