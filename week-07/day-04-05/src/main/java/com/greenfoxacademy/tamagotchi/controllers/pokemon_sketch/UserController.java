package com.greenfoxacademy.tamagotchi.controllers.pokemon_sketch;

import com.greenfoxacademy.tamagotchi.services.services_sketch.UserService;
import com.greenfoxacademy.tamagotchi.services.services_sketch.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @GetMapping("")
  public String renderLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "username") String username) {
    userService.login(username);
    return "redirect:/profile/" + username;
  }

  @GetMapping("/profile/{username}")
  public String renderProfilePage(@PathVariable(value = "username") String username, Model model) {
    model.addAttribute("user", userService.getUser(username));
    return "profile";
  }

}
