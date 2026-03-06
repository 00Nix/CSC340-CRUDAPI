package com.csc340.crud_api;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }
    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }
     public Character updateCharacter(Long id, Character updatedCharacter) {
        return characterRepository.findById(id).map(existingCharacter -> {
            existingCharacter.setName(updatedCharacter.getName());
            existingCharacter.setDescription(updatedCharacter.getDescription());
            existingCharacter.setUniverse(updatedCharacter.getUniverse());
            existingCharacter.setPower(updatedCharacter.getPower());
            existingCharacter.setSpecies(updatedCharacter.getSpecies());
            existingCharacter.setRole(updatedCharacter.getRole());
            return characterRepository.save(existingCharacter);
        }
        ).orElse(null);
    }
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }    
    public List<Character> getCharactersByName(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
    public List<Character> getCharactersByUniverse(String universe) {
        return characterRepository.findByUniverseContainingIgnoreCase(universe);
    }
    public List<Character> getCharactersByPower(String power) {
        return characterRepository.findByPowerContainingIgnoreCase(power);
    }
    public List<Character> getCharactersBySpecies(String species) {
        return characterRepository.findBySpeciesContainingIgnoreCase(species);
    }
    public List<Character> getCharactersByRole(String role) {
        return characterRepository.findByRoleContainingIgnoreCase(role);
    }
    
}