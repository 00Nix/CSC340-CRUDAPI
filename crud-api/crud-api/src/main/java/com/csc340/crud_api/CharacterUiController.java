package com.csc340.crud_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String showForm() {
        return "new-character-form";
    }
    @GetMapping("/index")
    public String getAllCharacters(Model model) {
        model.addAttribute("index", characterService.getAllCharacters());
        return "index";
    }
    @GetMapping("/search")
    public String searchCharacterByName(@RequestParam String name, Model model) {
        model.addAttribute("index", characterService.getCharactersByName(name));
        return "index";
    }
    @GetMapping("/search/power")
    public String searchCharacterByPower(@RequestParam String power, Model model) {
        model.addAttribute("index", characterService.getCharactersByPower(power));
        return "index";
    }
    @GetMapping("/search/role")
    public String searchCharacterByRole(@RequestParam String role, Model model) {
        model.addAttribute("index", characterService.getCharactersByRole(role));
        return "index";
    }
    @GetMapping("/search/universe")
    public String searchCharacterByUniverse(@RequestParam String universe, Model model) {
        model.addAttribute("index", characterService.getCharactersByUniverse(universe));
        return "index";
    }
    @GetMapping("/search/species")
    public String searchCharacterBySpecies(@RequestParam String species, Model model) {
        model.addAttribute("index", characterService.getCharactersBySpecies(species));
        return "index";
    }

}
