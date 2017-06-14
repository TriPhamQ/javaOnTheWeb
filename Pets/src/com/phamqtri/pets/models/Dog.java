package com.phamqtri.pets.models;

public class Dog extends Animal implements Pet {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		String outputString;
		
		if (this.getWeight() > 30) {
			outputString = "hopped into your lap and cuddled you";
		}
		else {
			outputString = "curled up next to you";
		}
		
		return outputString;
	}	
}
