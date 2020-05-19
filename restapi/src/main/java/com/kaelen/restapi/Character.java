package com.kaelen.restapi;

public class Character {
	private String name;
    private String species;
    private String personality;
    private double birthDate;
    private String catchPhrase;
    
    public Character(String name, String species, String personality, double birthDate, String catchPhrase) {
        this.name = name;
        this.species = species;
        this.personality = personality;
        this.birthDate = birthDate;
        this.catchPhrase = catchPhrase;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public String getPersonality() {
        return personality;
    }
    
    public double getBirthDate() {
        return birthDate;
    }
    
    public String getCatchPhrase() {
        return catchPhrase;
    }
}

