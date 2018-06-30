package com.greenfoxacademy.tamagotchi.controllers;

import com.greenfoxacademy.tamagotchi.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  @Autowired
  FoxServiceImpl foxService;

  @GetMapping("/profile/{name}")
  public String renderProfilePage(@PathVariable(value = "name") String foxName, Model model) {
    model.addAttribute("fox", foxService.getFox(foxName));
    model.addAttribute("trickCounter", foxService.countKnownTricks(foxName));
    model.addAttribute("tricks", foxService.getFox(foxName).getTricks());
    return "profile";
  }

  @GetMapping("/profile/{name}/nutritionstore")
  public String renderNutritionStore(@PathVariable(value = "name") String foxName, Model model) {
    model.addAttribute("fox", foxService.getFox(foxName));
    model.addAttribute("foodstore", foxService.getFoodStore());
    model.addAttribute("drinkstore", foxService.getDrinkStore());
    model.addAttribute("trickstore", foxService.getNewTricks(foxName));
    return "nutritionstore";
  }

  @GetMapping("/newDiet")
  public String login(@RequestParam(value = "name") String foxName, @RequestParam(value = "food") String newFood, @RequestParam(value = "drink") String newDrink) {
    foxService.changeDiet(foxName, newFood, newDrink);
    return "redirect:/profile/" + foxName;
  }

  @GetMapping("profile/{name}/trickstore")
  public String renderTrickStore(@PathVariable(value = "name") String foxName, Model model) {
    model.addAttribute("trickCounter", foxService.countKnownTricks(foxName));
    model.addAttribute("isDoingTricks", foxService.getFox(foxName).isDoingTricks());
    model.addAttribute("fox", foxService.getFox(foxName));
    model.addAttribute("tricks", foxService.getNewTricks(foxName));
    return "trickstore";
  }

  @GetMapping("/newTrick")
  public String login(@RequestParam(value = "name") String foxName, @RequestParam(value = "newTrick") String newTrick) {
    foxService.learnNewTrick(foxName, newTrick);
    return "redirect:/profile/" + foxName;
  }


}
