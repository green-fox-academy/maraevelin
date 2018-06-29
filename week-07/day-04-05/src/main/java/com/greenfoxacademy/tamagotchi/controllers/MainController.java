package com.greenfoxacademy.tamagotchi.controllers;

import com.greenfoxacademy.tamagotchi.models.Store;
import com.greenfoxacademy.tamagotchi.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  FoxServiceImpl foxService;

  Store store = new Store();

  @GetMapping("")
  public String renderLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "name") String foxName) {
    foxService.login(foxName);
    return "redirect:/profile/" + foxName;
  }

  @GetMapping("/profile/{name}")
  public String renderProfilePage(@PathVariable(value = "name") String foxName, Model model) {
    model.addAttribute("fox", foxService.getFox(foxName));
    model.addAttribute("trickCounter", foxService.countKnownTricks(foxName));
    return "profile";
  }

  @GetMapping("/profile/{name}/nutritionstore")
  public String renderNutritiomStore(@PathVariable(value = "name") String foxName, Model model) {
    model.addAttribute("fox", foxService.getFox(foxName));
    model.addAttribute("foodstore", store.getFoodStore());
    model.addAttribute("drinkstore", store.getDrinkStore());
//    model2.addAttribute("foodstore", store.getFoodStore());
//    model3.addAttribute("drinkstore", store.getDrinkStore());
    return "nutritionstore";
  }

}
