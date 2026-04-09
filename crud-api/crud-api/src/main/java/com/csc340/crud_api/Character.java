package com.csc340.crud_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;
    
    private String name;
    private String description;
    private String universe;
    private String power;
    private String species;
    private String role;
    private String firstAppearance;
    private String personalityTraits;
    private String imageUrl;

    public Character() {
    }

    public Character(Long characterId, String name, String description, String universe, String power, String species, String role, String firstAppearance, String personalityTraits) {
        this.characterId = characterId;
        this.name = name;
        this.description = description;
        this.universe = universe;
        this.power = power;
        this.species = species;
        this.role = role;
        this.firstAppearance = firstAppearance;
        this.personalityTraits = personalityTraits;
        this.imageUrl = imageUrl;
    }
    public Long getCharacterId() {
        return characterId;
    }
    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUniverse() {
        return universe;
    }
    public void setUniverse(String universe) {
        this.universe = universe;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getFirstAppearance() {
        return firstAppearance;
    }
    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }
     public String getPersonalityTraits() {
        return personalityTraits;
    }
    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}