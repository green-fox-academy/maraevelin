package com.greenfoxacademy.dependency.useful_utilities_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String showUseful(Model model) {
    model.addAttribute("color", "Colored Background");
    model.addAttribute("email", "Email Validator");
    model.addAttribute("caesar", "Caesar Encoder/Decoder");
    return "useful";
  }

  @GetMapping("useful/colored")
  public String showColored(Model model) {
    model.addAttribute("random", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful/eamil")
  public String 

}
