package com.csc340.crud_api;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/characters")
public class CharacterApiController {
    
    private final CharacterService characterService;

    public CharacterApiController(CharacterService characterService) {
        this.characterService = characterService;
    }
    //get all characters
    @GetMapping
    public ResponseEntity<List<Character>> getAllCharacters() {
        List<Character> characters = characterService.getAllCharacters();
        return ResponseEntity.ok(characters);
    }
    //get character by id
    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable Long id) {
       
        Character character = characterService.getCharacterById(id);
        if (character != null) {
            return ResponseEntity.ok(character);
        } else {
            return ResponseEntity.notFound().build();
        }
}
    //add a new character
    @PostMapping
    public ResponseEntity<Character> addCharacter(@RequestBody Character character) {
        Character savedCharacter = characterService.createCharacter(character);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCharacter);
    }
    //update a character
    @PutMapping("/{id}")
    public ResponseEntity<Character> updateCharacter(@PathVariable Long id, @RequestBody Character characterDetails) {
            Character updatedCharacter = characterService.updateCharacter(id, characterDetails);
            if (updatedCharacter != null) {
                return ResponseEntity.ok(updatedCharacter);
            } else {
                return ResponseEntity.notFound().build();
            }
    }
    //delete a character
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return ResponseEntity.noContent().build();
    }

    //search characters by name
    @GetMapping("/search")
    public ResponseEntity<List<Character>> searchCharactersByName(@RequestParam String name) {
        return ResponseEntity.ok(characterService.getCharactersByName(name));
    }

    //search characters by universe
    @GetMapping("/search/universe")
    public ResponseEntity<List<Character>> searchCharactersByUniverse(@RequestParam String universe) {
        return ResponseEntity.ok(characterService.getCharactersByUniverse(universe));
    }

    //search characters by power
    @GetMapping("/search/power")
    public ResponseEntity<List<Character>> searchCharactersByPower(@RequestParam String power) {
        return ResponseEntity.ok(characterService.getCharactersByPower(power));
    }
    //search characters by species
    @GetMapping("/search/species")
    public ResponseEntity<List<Character>> searchCharactersBySpecies(@RequestParam String species) {
        return ResponseEntity.ok(characterService.getCharactersBySpecies(species));
    }

    //search characters by role
    @GetMapping("/search/role")
    public ResponseEntity<List<Character>> searchCharactersByRole(@RequestParam String role) {
        return ResponseEntity.ok(characterService.getCharactersByRole(role));
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Character>> getCharactersByCategory(@PathVariable String category) {
    List<Character> characters = characterService.getCharactersByUniverse(category);
        return ResponseEntity.ok(characters);
    }   
}
