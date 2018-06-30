package com.greenfoxacademy.tamagotchi.controllers;

import com.greenfoxacademy.tamagotchi.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  FoxServiceImpl foxService;

  @GetMapping("")
  public String renderLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "name") String foxName) {
    foxService.login(foxName);
    return "redirect:/profile/" + foxName;
  }

}
