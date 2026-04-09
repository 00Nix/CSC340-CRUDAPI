package com.csc340.crud_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/characters")
public class CharacterUiController {

    @Autowired
    private CharacterService characterService;
    
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/{id}")
    public String getCharacterById(@PathVariable Long id, Model model) {    
        Character character = characterService.getCharacterById(id);
        model.addAttribute("character", character);
        if (character != null) {
            return "details";
        } else {
            return "about";
        }
    }
    @GetMapping("/add")
    public String showAddCharacterForm(Model model) {
        model.addAttribute("character", new Character());
        model.addAttribute("title", "Add New Character");
        return "new-character-form";
    }
    @PostMapping("/save")
    public String saveCharacter(Character character) {
        characterService.createCharacter(character);
            return "redirect:/characters/character-list";
    }
    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Character character = characterService.getCharacterById(id);
        model.addAttribute("character", character);
        model.addAttribute("title", "Update Character: " + character.getName());
        return "character-update";
    }
    @PostMapping("/update/{id}")
    public String updateCharacter(@PathVariable Long id, Character character) {
        characterService.updateCharacter(id, character);
        return "redirect:/characters" + id;
    }
    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "redirect:/characters/character-list";
    }
    
    @GetMapping("/character-list")
    public String getAllCharacters(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        return "character-list";
    }
    @GetMapping("/search")
    public String searchCharacterByName(@RequestParam String name, Model model) {
        model.addAttribute("characterList", characterService.getCharactersByName(name));
        return "character-list";
    }
    @GetMapping("/search/power")
    public String searchCharacterByPower(@RequestParam String power, Model model) {
        model.addAttribute("characterList", characterService.getCharactersByPower(power));
        return "character-list";
    }
    @GetMapping("/search/role")
    public String searchCharacterByRole(@RequestParam String role, Model model) {
        model.addAttribute("characterList", characterService.getCharactersByRole(role));
        return "character-list";
    }
    @GetMapping("/search/universe")
    public String searchCharacterByUniverse(@RequestParam String universe, Model model) {
        model.addAttribute("characterList", characterService.getCharactersByUniverse(universe));
        return "character-list";
    }
    @GetMapping("/search/species")
    public String searchCharacterBySpecies(@RequestParam String species, Model model) {
        model.addAttribute("characterList", characterService.getCharactersBySpecies(species));
        return "character-list";
    }

}
