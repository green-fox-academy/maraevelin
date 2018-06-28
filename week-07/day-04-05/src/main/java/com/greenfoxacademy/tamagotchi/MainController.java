package com.greenfoxacademy.tamagotchi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("")
  public String showIndex() {
    return "index";
  }

  @GetMapping("/login")
  public String showLoging() {
    return "login";
  }

}
