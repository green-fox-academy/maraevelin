package com.greenfoxacademy.tamagotchi.controllers.pokemon_sketch;

import com.greenfoxacademy.tamagotchi.models.models_sketch.Pokemon;
import com.greenfoxacademy.tamagotchi.models.models_sketch.User;
import com.greenfoxacademy.tamagotchi.services.services_sketch.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PokemonController {

  private UserServiceImpl userService;

  @Autowired
  public PokemonController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @GetMapping("/{username}/hunt")
  public String renderHuntPage(@PathVariable(value = "username") String username, Model model) {
    Pokemon pokemon = new Pokemon();
    model.addAttribute("pokemon", pokemon);
    model.addAttribute("username", username);
    return "hunt";
  }

  @PostMapping("/{username}/catch")
  public String catchPokemon(@PathVariable(value = "username") String username, @ModelAttribute Pokemon pokemon) {
    User user = userService.getUser(username);
    user.addPokemon(pokemon);
    return "redirect:/profile/" + username;
  }

}