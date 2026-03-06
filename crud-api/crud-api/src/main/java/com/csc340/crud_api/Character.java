package com.csc340.crud_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false)
    private String universe;

    @Column(nullable = false)
    private String power;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String role;

    public Character() {
    }

    public Character(Long characterId, String name, String description, String universe, String power, String species, String role) {
        this.characterId = characterId;
        this.name = name;
        this.description = description;
        this.universe = universe;
        this.power = power;
        this.species = species;
        this.role = role;
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
}