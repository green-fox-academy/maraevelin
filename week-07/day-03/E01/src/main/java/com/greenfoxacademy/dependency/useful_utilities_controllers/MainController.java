package com.greenfoxacademy.dependency.useful_utilities_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("useful")
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

  @GetMapping("useful/email")
  public String validateEmail(@RequestParam (name = "email") String emailParameter, Model model) {
    model.addAttribute("emailAsParameter", emailParameter);
    model.addAttribute("validateEmail", utilityService.validateEmail(emailParameter));
    return "email";
  }

}
