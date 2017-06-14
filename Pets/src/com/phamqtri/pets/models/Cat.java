package com.phamqtri.pets.models;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		return "looked at your with some affection";
	}
}
