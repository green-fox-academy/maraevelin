package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/show")
  public String showBankAccountPage(Model model) {
    model.addAttribute("bankaccount", new BankAccount("Simba", 2000, "lion", "Zebra"));
    return "show";
  }

}
